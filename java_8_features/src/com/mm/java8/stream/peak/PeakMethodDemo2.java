package com.mm.java8.stream.peak;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PeakMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}
		};
		Object numberSquares = numbers.stream()
			.peek(number -> System.out.println("Before maping : " + number))
			.map(function)
			.peek(number -> System.out.println("After maping : " + number))
			.collect(Collectors.toList());

		System.out.println("Squares of numbers : " + numberSquares);

		Object numberCubs = numbers.stream()
			.peek(number -> System.out.println("Before maping : " + number))
			.map((number) -> number * number * number)
			.peek(number -> System.out.println("After maping : " + number))
			.collect(Collectors.toList());
		System.out.println("Cubs of numbers : " + numberCubs);

	}
}
