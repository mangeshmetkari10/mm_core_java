package com.mm.java8.stream.collectors.minBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinByCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Integer minNumber = numbers.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
		System.out.println("Min Number  : " + minNumber);

	}
}
