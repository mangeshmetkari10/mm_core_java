package com.mm.java8.stream.collectors.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);
		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				return number % 2 == 0;
			}
		};

		Map<Boolean, List<Integer>> evenNumberVsOdd = numbers.stream().collect(Collectors.partitioningBy(predicate));
		System.out.println("Map of even numbers vs odd : " + evenNumberVsOdd);

	}
}
