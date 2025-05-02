package com.mm.java8.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo2 {

	public static void main(String[] args) {

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(6, 7, 8, 9));
		System.out.println("Original Number list : " + numbers);

		Object numberSquares = numbers.stream().map(x -> x).collect(Collectors.toList());
		System.out.println("numbers : " + numberSquares);

		Object numberCubs = numbers.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("numbers : " + numberCubs);

	}
}
