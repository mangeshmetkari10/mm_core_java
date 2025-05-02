package com.mm.java8.stream.collectors.counting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Long count = numbers.stream().collect(Collectors.counting());
		System.out.println("count of numbers : " + count);

	}
}
