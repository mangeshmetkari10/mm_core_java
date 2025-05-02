package com.mm.java8.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}
		};
		Object numberSquares = numbers.stream().map(function).collect(Collectors.toList());
		System.out.println("Squares of numbers : " + numberSquares);

		Object numberCubs = numbers.stream().map((number) -> number * number * number).collect(Collectors.toList());
		System.out.println("Cubs of numbers : " + numberCubs);

	}
}
