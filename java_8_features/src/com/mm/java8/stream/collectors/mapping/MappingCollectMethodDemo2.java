package com.mm.java8.stream.collectors.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Object mapNumberToSquares = numbers.stream().collect(Collectors.mapping(num -> num * num, Collectors.toList()));
		System.out.println("mapping of number to Squares  : " + mapNumberToSquares);

		Object mapNumberToCubs = numbers.stream()
			.collect(Collectors.mapping(num -> num * num * num, Collectors.toList()));
		System.out.println("mapping of number to Cubs" + "  : " + mapNumberToCubs);

	}
}
