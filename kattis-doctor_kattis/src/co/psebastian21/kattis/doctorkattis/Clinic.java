package co.psebastian21.kattis.doctorkattis;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Clinic {
	
	private SortedSet<Cat> patientsSet;
	private Map<String, Cat> patientsMap;
	
	public Clinic() {
		this.patientsSet = new TreeSet<>();
		this.patientsMap = new HashMap<>();
	}
	
	public void arriveAtClinic(String catName, int infectionLevel) {
		Cat cat = new Cat(catName, infectionLevel, System.currentTimeMillis());
		this.patientsMap.put(catName, cat);
		this.patientsSet.add(cat);
	}
	public void updateInfectionLevel(String catName, int increment) {
		this.patientsMap.get(catName).incrementInfectionLevel(increment);
	}
	public void treat(String catName) {
		Cat treatedCat = this.patientsMap.remove(catName);
		this.patientsSet.remove(treatedCat);
	}
	public String query() {
		return this.patientsSet.isEmpty() ? "The clinic is empty" : this.patientsSet.first()
				.getName();
	}

}
