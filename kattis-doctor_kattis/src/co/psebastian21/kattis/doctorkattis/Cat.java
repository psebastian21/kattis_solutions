package co.psebastian21.kattis.doctorkattis;

import java.util.Objects;

// Note: this class has a natural ordering that is inconsistent with equals.
public class Cat implements Comparable<Cat> {
	
	private String name;
	private int infectionDegree;
	private long arrivalTime;
		
	public Cat(String name, int infectionDegree, long arrivalTime) {
		this.name = name;
		this.infectionDegree = infectionDegree;
		this.arrivalTime = arrivalTime;
	}

	public String getName() {
		return name;
	}

	public int getInfectionDegree() {
		return infectionDegree;
	}
	
	public long getArrivalTime() {
		return arrivalTime;
	}

	public void incrementInfectionDegree(int increment) {
		this.infectionDegree += increment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arrivalTime, infectionDegree, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cat))
			return false;
		Cat other = (Cat) obj;
		return arrivalTime == other.arrivalTime && infectionDegree == other.infectionDegree
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Cat o) {
		if(this.infectionDegree > o.infectionDegree)
			return -1;
		else if(this.infectionDegree == o.infectionDegree && this.arrivalTime < o.arrivalTime)
			return -1;
		else if(this.infectionDegree == o.infectionDegree && this.arrivalTime == o.arrivalTime)
			return 0;
		else return 1;
	}

}
