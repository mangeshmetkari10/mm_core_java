package com.mm.java8.stream.collectors.averagingInt;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class AveragingIntCollectMethodDemo1 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);
		// Original Number list : [1, 2, 3, 4, 5, 6, 7, 8, 9]
		ToIntFunction<Integer> mapper = new ToIntFunction<Integer>() {

			@Override
			public int applyAsInt(Integer value) {
				return value;
			}
		};
		Double count = numbers.stream().collect(Collectors.averagingInt(mapper));
		System.out.println("count of numbers : " + count);// count of numbers : 5.0
	}
}
