package com.mm.java8.stream.collectors.counting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mangesh", "Mayur");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mangesh, Mayur]
		Long count = names.stream().map((name) -> name.toLowerCase()).collect(Collectors.counting());
		System.out.println("names count: " + count);// names count: 5
	}
}
