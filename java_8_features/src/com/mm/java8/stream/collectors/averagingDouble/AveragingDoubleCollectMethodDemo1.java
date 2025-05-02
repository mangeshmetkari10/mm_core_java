package com.mm.java8.stream.collectors.averagingDouble;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class AveragingDoubleCollectMethodDemo1 {

	public static void main(String[] args) {

		List<Double> numbers = Arrays.asList(1.1, 2.2, 3.3, 4.4);
		System.out.println("Original Number list : " + numbers);
		// Original Number list : [1.1, 2.2, 3.3, 4.4]
		ToDoubleFunction<Double> mapper = new ToDoubleFunction<Double>() {

			@Override
			public double applyAsDouble(Double value) {
				return value;
			}
		};
		Double count = numbers.stream().collect(Collectors.averagingDouble(mapper));
		System.out.println("average : " + count);// average : 2.75

	}
}
