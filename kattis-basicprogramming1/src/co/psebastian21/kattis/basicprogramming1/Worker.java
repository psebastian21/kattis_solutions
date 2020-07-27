package co.psebastian21.kattis.basicprogramming1;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Worker {
	
	private Integer[] array;

	public Worker(Integer[] array) {
		this.array = array;
	}
	
	public String one() {
		return "7";
	}
	public String two() {
		if(array[0] > array[1])
			return "Bigger";
		else if (array[0].equals(array[1]))
			return "Equal";
		else
			return "Smaller";
	}
	public String three() {
		SortedSet<Integer> set = new TreeSet<>();
		set.addAll(Arrays.asList(Arrays.copyOfRange(array, 0, 3)));
		Integer median = set.toArray(new Integer[0])[1];
		return String.valueOf(median);
	}
	public String four() {
		return String.valueOf(Arrays.stream(array)
				.reduce(0, Integer::sum));
	}
	public String five() {
		return String.valueOf(Arrays.stream(array)
				.filter(i -> i % 2 == 0)
				.reduce(0, Integer::sum));
	}
	public String six() {
		int[] chars = Arrays.stream(array)
				.mapToInt(i -> i % 26 + 97)
				.toArray();
		return new String(chars, 0, chars.length);
	}
	public String seven() {
		return "";
	}
	

}
