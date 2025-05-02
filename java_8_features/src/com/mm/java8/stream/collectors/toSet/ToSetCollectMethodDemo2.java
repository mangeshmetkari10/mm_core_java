package com.mm.java8.stream.collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Set<Integer> numberSquares = numbers.stream().map(number -> number * number).collect(Collectors.toSet());
		System.out.println("Set of Squares of numbers : " + numberSquares);

		Set<Integer> numberCubs = numbers.stream()
			.map((number) -> number * number * number)
			.collect(Collectors.toSet());
		System.out.println("Set of Cubs of numbers : " + numberCubs);

	}
}
