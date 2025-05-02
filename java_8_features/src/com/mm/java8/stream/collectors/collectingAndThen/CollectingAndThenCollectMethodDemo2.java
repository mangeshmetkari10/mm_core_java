package com.mm.java8.stream.collectors.collectingAndThen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThenCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		String result = numbers.stream()
			.collect(Collectors.collectingAndThen(Collectors.toList(),
					list -> list.stream().map(String::valueOf).collect(Collectors.joining(", "))));

		System.out.println(" Number in String : " + result);
		String numberCubs = numbers.stream()
			.map((number) -> number * number * number)
			.collect(Collectors.collectingAndThen(Collectors.toList(),
					list -> list.stream().map(String::valueOf).collect(Collectors.joining(", "))));
		System.out.println("Cubs of numbers in String : " + numberCubs);

	}
}
