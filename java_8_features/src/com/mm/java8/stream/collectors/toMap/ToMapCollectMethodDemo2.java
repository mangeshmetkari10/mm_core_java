package com.mm.java8.stream.collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		System.out.println("Original list : " + numbers);//Original list : [1, 2, 3, 4]
		Function<Integer, Integer> valueMapper = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t * t;
			}
		};
		Map<Integer, Integer> mapNumberVsSquares = numbers.stream()
			.collect(Collectors.toMap(Function.identity(), valueMapper));
		System.out.println("Number Vs Squares:" + mapNumberVsSquares);
		//Number Vs Squares  : {1=1, 2=4, 3=9, 4=16}
		Map<Integer, Integer> mapNumberVsCubs = numbers.stream()
			.collect(Collectors.toMap(num -> num, num -> num * num * num));
		System.out.println("Numbers Vs Cubs:" + mapNumberVsCubs);
		//Numbers Vs Cubs : {1=1, 2=8, 3=27, 4=64}
	}
}
