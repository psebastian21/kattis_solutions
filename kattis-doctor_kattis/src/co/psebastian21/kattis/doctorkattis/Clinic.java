package co.psebastian21.kattis.doctorkattis;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Clinic {
	
	private SortedSet<Cat> patientsSet;
	private Map<String, Cat> patientsMap;
	private int arrivalOrder;
	
	public Clinic() {
		this.patientsSet = new TreeSet<>();
		this.patientsMap = new HashMap<>();
		this.arrivalOrder = 0;
	}
	
	public void arriveAtClinic(String catName, int infectionLevel) {
		Cat cat = new Cat(catName, infectionLevel, this.arrivalOrder);
		this.patientsMap.put(catName, cat);
		this.patientsSet.add(cat);
		this.arrivalOrder++;
	}
	public void updateInfectionLevel(String catName, int increment) {
		Cat updatedCat = this.patientsMap.get(catName);
		this.patientsSet.remove(updatedCat);
		updatedCat.incrementInfectionLevel(increment);
		this.patientsSet.add(updatedCat);
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
