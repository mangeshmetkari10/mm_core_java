package com.mm.java8.stream.skip;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SkipMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {

				return t * t;
			}
		};
		Object numberSquares = numbers.stream().map(function).skip(2).collect(Collectors.toList());

		System.out.println("Squares of numbers : " + numberSquares);

	}
}
