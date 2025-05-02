package com.mm.java8.stream.collectors.averagingLong;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class AveragingLongCollectMethodDemo1 {

	public static void main(String[] args) {

		List<Long> numbers = Arrays.asList(200l, 300l, 500l, 600l);
		System.out.println("Original Number list : " + numbers);

		ToLongFunction<Long> mapper = new ToLongFunction<Long>() {

			@Override
			public long applyAsLong(Long value) {
				return value;
			}
		};
		Double count = numbers.stream().collect(Collectors.averagingLong(mapper));
		System.out.println("average : " + count);// average : 5.0

	}
}
