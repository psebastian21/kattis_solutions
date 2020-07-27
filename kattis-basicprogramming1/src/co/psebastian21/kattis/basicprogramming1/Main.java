package co.psebastian21.kattis.basicprogramming1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine().split(" ")[1]);
		Integer[] array = Arrays.stream(reader.readLine().split(" "))
				.map(Integer::valueOf)
				.toArray(Integer[]::new);
		Worker worker = new Worker(array);
		switch(t) {
		case 1:
			System.out.print(worker.one());
			break;
		case 2:
			System.out.print(worker.two());
			break;
		case 3:
			System.out.print(worker.three());
			break;
		case 4:
			System.out.print(worker.four());
			break;
		case 5:
			System.out.print(worker.five());
			break;
		case 6:
			System.out.print(worker.six());
			break;
			default:
				System.out.print(worker.seven());
		}
		
	}

}
