package com.mm.java8.stream.collectors.toCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ToCollectionCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Supplier<Set<Integer>> collectionFactory = new Supplier<Set<Integer>>() {

			@Override
			public Set<Integer> get() {
				return new HashSet<Integer>();
			}
		};

		Set<Integer> numberSquares = numbers.stream()
			.map(number -> number * number)
			.collect(Collectors.toCollection(collectionFactory));
		System.out.println("Set of Squares of numbers : " + numberSquares);

		List<Integer> numberCubs = numbers.stream()
			.map((number) -> number * number * number)
			.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("List of Cubs of numbers : " + numberCubs);

	}
}
