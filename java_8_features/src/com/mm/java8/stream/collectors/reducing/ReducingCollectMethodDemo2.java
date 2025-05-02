package com.mm.java8.stream.collectors.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Integer sum = numbers.stream().collect(Collectors.reducing((num1, num2) -> num1 + num2)).get();
		System.out.println("sum of numbers : " + sum);

		Integer sumWithIntialValue = numbers.stream().collect(Collectors.reducing(100, (num1, num2) -> num1 + num2));
		System.out.println("sum of numbers with intial value 100 : " + sumWithIntialValue);

		Integer sumofSquaresWithIntialValue = numbers.stream()
			.collect(Collectors.reducing(0, num -> num * num, (num1, num2) -> num1 + num2));
		System.out.println("sum of squares of numbers with intial value 0 : " + sumofSquaresWithIntialValue);

	}
}
