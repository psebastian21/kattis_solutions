package co.psebastian21.kattis.doctorkattis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		Clinic clinic = new Clinic();
		for (int i = 0; i < n; i++) {
			String command = reader.readLine();
			switch (command.charAt(0)) {
			case '0':
				String[] arriveCommand = command.substring(2).split(" ");
				clinic.arriveAtClinic(arriveCommand[0], Integer.parseInt(arriveCommand[1]));
				break;
			case '1':
				String[] updateCommand = command.substring(2).split(" ");
				clinic.updateInfectionLevel(updateCommand[0], Integer.parseInt(updateCommand[1]));
				break;
			case '2':
				String catName = command.substring(2);
				clinic.treat(catName);
				break;
			default:
				System.out.println(clinic.query());
			}
		}
	}

}
