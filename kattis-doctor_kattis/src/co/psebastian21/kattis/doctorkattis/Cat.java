package co.psebastian21.kattis.doctorkattis;

import java.util.Objects;

// Note: this class has a natural ordering that is inconsistent with equals.
public class Cat implements Comparable<Cat> {
	
	private String name;
	private int infectionLevel;
	private int arrivalOrder;
		
	public Cat(String name, int infectionDegree, int arrivalOrder) {
		this.name = name;
		this.infectionLevel = infectionDegree;
		this.arrivalOrder = arrivalOrder;
	}

	public String getName() {
		return name;
	}

	public int getInfectionDegree() {
		return infectionLevel;
	}
	
	public int getArrivalOrder() {
		return arrivalOrder;
	}

	public void incrementInfectionLevel(int increment) {
		this.infectionLevel += increment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arrivalOrder, infectionLevel, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cat))
			return false;
		Cat other = (Cat) obj;
		return arrivalOrder == other.arrivalOrder && infectionLevel == other.infectionLevel
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Cat o) {
		if(this.infectionLevel > o.infectionLevel)
			return -1;
		else if(this.infectionLevel == o.infectionLevel && this.arrivalOrder < o.arrivalOrder)
			return -1;
		else if(this.infectionLevel == o.infectionLevel && this.arrivalOrder == o.arrivalOrder)
			return 0;
		else return 1;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", infectionLevel=" + infectionLevel + ", arrivalOrder=" + arrivalOrder + "]";
	}

}
