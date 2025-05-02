package com.mm.java8.stream.collectors.ConcurrentMap;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToConcurrentMapCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 5, 6, 8, 9);
		System.out.println("list : " + numbers);

		Function<Integer, Integer> valueMapper = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		ConcurrentMap<Integer, Integer> mapNumberVsSquares = numbers.stream()
			.collect(Collectors.toConcurrentMap(Function.identity(), valueMapper));
		System.out.println("ConcurrentMap of number Vs Squares  : " + mapNumberVsSquares);

		ConcurrentMap<Integer, Integer> mapNumberVsCubs = numbers.stream()
			.collect(Collectors.toConcurrentMap(num -> num, num -> num * num * num));
		System.out.println("ConcurrentMap of numbers Vs Cubs : " + mapNumberVsCubs);

	}
}
