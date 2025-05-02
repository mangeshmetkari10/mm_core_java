package com.mm.java8.stream.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 7, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list :" + numbers);

		List<Integer> namesStartsWithM = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct numbers     :" + namesStartsWithM);

	}
}
