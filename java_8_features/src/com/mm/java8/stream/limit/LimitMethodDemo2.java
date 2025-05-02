package com.mm.java8.stream.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		List<Integer> namesStartsWithM = numbers.stream()
			.filter(number -> number % 2 == 0)
			.limit(2)
			.collect(Collectors.toList());
		System.out.println("2 Even numbers : " + namesStartsWithM);

		// using lambda expression
		List<Integer> namesStartsWithA = numbers.stream()
			.filter((number) -> number % 2 == 0)
			.limit(3)
			.collect(Collectors.toList());
		System.out.println("3 Odd numbers : " + namesStartsWithA);
	}
}
