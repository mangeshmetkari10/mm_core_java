package com.mm.java8.stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodIntegerDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(6, 4, 5, 3, 7, 2, 1, 8, 9);
		System.out.println("Original Number list : " + numbers);
		// Original Number list : [6, 4, 5, 3, 7, 2, 1, 8, 9]
		List<Integer> sortedNumberAsc = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted number list (natural sorting) : " + sortedNumberAsc);
		//Sorted number list (natural sorting) : [1, 2, 3, 4, 5, 6, 7, 8, 9]
		List<Integer> sortedNumberDesc = numbers.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		System.out.println("Sorted number list (reverse sorting) : " + sortedNumberDesc);
		//Sorted number list (reverse sorting) : [9, 8, 7, 6, 5, 4, 3, 2, 1]
	}
}