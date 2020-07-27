package co.psebastian21.kattis.basicprogramming1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Worker {
	
	private Integer[] array;

	public Worker(Integer[] array) {
		this.array = array;
	}
	
	public String one() {
		return "7";
	}
	public String two() {
		int first = array[0];
		int second = array[1];
		if(first > second)
			return "Bigger";
		else if (first == second)
			return "Equal";
		else
			return "Smaller";
	}
	public String three() {
		List<Integer> subArray = Arrays.asList(array[0], array[1], array[2]);
		Collections.sort(subArray);
		return String.valueOf(subArray.get(1));
	}
	public String four() {
		int sum = 0;
		for(int i : array) {
			sum += i;
		}
		return String.valueOf(sum);
	}
	public String five() {
		int sum = 0;
		for(int i : array) {
			sum += i % 2 == 0 ? i: 0;
		}
		return String.valueOf(sum);
	}
	public String six() {
		StringBuilder sb = new StringBuilder();
		for(int i : array) {
			sb.append((char)(i % 26 + 97));
		}
		return sb.toString();
	}
	public String seven() {
		int i = 0;
		HashSet<Integer> visitedIndexes = new HashSet<>();
		while(!visitedIndexes.contains(i)) {
			if(i >= array.length)
				return "Out";
			else if(i == array.length - 1)
				return "Done";
			visitedIndexes.add(i);
			i = array[i];
		}
		return "Cyclic";
	}
	

}
