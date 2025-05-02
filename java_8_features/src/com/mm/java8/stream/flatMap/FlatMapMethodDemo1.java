package com.mm.java8.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo1 {

	public static void main(String[] args) {

		List<List<String>> names = Arrays.asList(Arrays.asList("Mangesh", "Shubham"), Arrays.asList("Amit", "Sumit"),
				Arrays.asList("Raj", "Mayur"));
		System.out.println("Original names list : " + names);
		// Original names list : [[Mangesh, Shubham], [Amit, Sumit], [Raj, Mayur]]

		List<List<String>> nameInUpperCase = names.stream().map(x -> x).collect(Collectors.toList());
		System.out.println("List names: " + nameInUpperCase);
		// List names: [[Mangesh, Shubham], [Amit, Sumit], [Raj, Mayur]]

		List<String> nameInUpperCase1 = names.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("List of names: " + nameInUpperCase1);
		// List of names: [Mangesh, Shubham, Amit, Sumit, Raj, Mayur]
	}
}