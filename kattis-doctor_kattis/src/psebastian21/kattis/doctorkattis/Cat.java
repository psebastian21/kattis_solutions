package psebastian21.kattis.doctorkattis;

import java.util.Objects;

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
		// TODO Auto-generated method stub
		return 0;
	}

}
