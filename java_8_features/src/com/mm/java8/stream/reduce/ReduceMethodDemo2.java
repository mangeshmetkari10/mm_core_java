package com.mm.java8.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);
		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {

				return t + u;
			}
		};
		int sum1 = numbers.stream().reduce(accumulator).get();
		System.out.println("sum of numners : " + sum1);

		int sum2 = numbers.stream().reduce((s1, s2) -> s2 + s1).get();
		System.out.println("sum of numbers reverse : " + sum2);

		int sumWithInitialValue1 = numbers.stream().reduce(0, accumulator);
		System.out.println("sum of numbers with 0 initial value  : " + sumWithInitialValue1);

		int sumWithInitialValue2 = numbers.stream().reduce(100, ((s1, s2) -> s1 + s2));
		System.out.println("sum of numbers  with 100 initial value  : " + sumWithInitialValue2);

		int sumWithInitialValueAndCombiner1 = numbers.stream().reduce(0, accumulator, accumulator);
		System.out.println("sum of numbers with 0 initial value  : " + sumWithInitialValueAndCombiner1);

		int sumWithInitialValueAndCombiner2 = numbers.stream().reduce(100, ((s1, s2) -> s1 + s2),
				((s1, s2) -> s2 + s1));
		System.out.println("sum of numbers  100 initial value  : " + sumWithInitialValueAndCombiner2);
	}
}
