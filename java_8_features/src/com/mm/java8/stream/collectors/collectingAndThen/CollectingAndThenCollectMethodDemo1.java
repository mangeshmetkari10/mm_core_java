package com.mm.java8.stream.collectors.collectingAndThen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingAndThenCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("list : " + names);// list : [Mangesh, Shubham, Raj, Mayur]

		String longestNameInUpperCase = names.stream()
			.collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(String::length)),
					longest -> longest.get().toUpperCase()));

		System.out.println("Longest String : " + longestNameInUpperCase);
		// Longest String : MANGESH

		String nameString = names.stream()
			.map((name) -> name.toLowerCase())
			.sorted()
			.collect(Collectors.collectingAndThen(Collectors.toList(),
					list -> list.stream().collect(Collectors.joining("_"))));
		System.out.println("Name String : " + nameString);
		// Name String : mangesh_shubham_raj_mayur
	}
}