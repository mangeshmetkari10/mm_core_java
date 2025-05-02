package com.mm.java8.stream.collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapCollectMethodWithCollisionDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Original Number list : " + numbers);
		//Original Number list : [1, 2, 3, 4, 5]
		Function<Integer, Integer> valueMapper = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		/*
		 * Map<Integer, Integer> mapNumberVsSquares = numbers.stream()
		 * .collect(Collectors.toMap(Function.identity(), valueMapper));
		 * System.out.println("Map of number Vs Squares  : " + mapNumberVsSquares);
		 */

		/*
		 * Map<Integer, Integer> mapNumberVsCubs = numbers.stream()
		 * .collect(Collectors.toMap(num -> num, num -> num * num * num));
		 * System.out.println("Map of numbers Vs Cubs : " + mapNumberVsCubs);
		 */

		BinaryOperator<Integer> mergeFunction = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer key, Integer identicalKey) {
				return key;
			}
		};

		Map<Integer, Integer> mapNumberVsSquares = numbers.stream()
			.collect(Collectors.toMap(Function.identity(), valueMapper, mergeFunction));
		System.out.println("Map of number Vs Squares  : " + mapNumberVsSquares);
		//Map of number Vs Squares  : {1=1, 2=4, 3=9, 4=16, 5=25}
		Map<Integer, Integer> mapNumberVsCubs = numbers.stream()
			.collect(Collectors.toMap(num -> num, num -> num * num * num, (key, identicalKey) -> identicalKey));
		System.out.println("Map of numbers Vs Cubs : " + mapNumberVsCubs);
		//Map of numbers Vs Cubs : {1=1, 2=8, 3=27, 4=64, 5=125}
	}
}
