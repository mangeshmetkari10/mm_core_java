package com.mm.java8.stream.collectors.minBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MinByCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mangesh", "Mayur");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mangesh, Mayur]
		String minName = names.stream().collect(Collectors.minBy(Comparator.naturalOrder())).get();
		System.out.println("name with min : " + minName);
		// name with min : Mangesh
		String minLengthName = names.stream()
			.collect(Collectors.minBy((str1, str2) -> Integer.compare(str1.length(), str2.length())))
			.get();
		System.out.println("name with min length: " + minLengthName);
		// name with min length: Raj
	}
}
