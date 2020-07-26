package co.psebastian21.kattis.doctorkattis;

import java.util.Objects;

// Note: this class has a natural ordering that is inconsistent with equals.
public class Cat implements Comparable<Cat> {
	
	private String name;
	private int infectionLevel;
	private long arrivalTime;
		
	public Cat(String name, int infectionDegree, long arrivalTime) {
		this.name = name;
		this.infectionLevel = infectionDegree;
		this.arrivalTime = arrivalTime;
	}

	public String getName() {
		return name;
	}

	public int getInfectionDegree() {
		return infectionLevel;
	}
	
	public long getArrivalTime() {
		return arrivalTime;
	}

	public void incrementInfectionLevel(int increment) {
		this.infectionLevel += increment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(arrivalTime, infectionLevel, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cat))
			return false;
		Cat other = (Cat) obj;
		return arrivalTime == other.arrivalTime && infectionLevel == other.infectionLevel
				&& Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Cat o) {
		if(this.infectionLevel > o.infectionLevel)
			return -1;
		else if(this.infectionLevel == o.infectionLevel && this.arrivalTime < o.arrivalTime)
			return -1;
		else if(this.infectionLevel == o.infectionLevel && this.arrivalTime == o.arrivalTime)
			return 0;
		else return 1;
	}

}
