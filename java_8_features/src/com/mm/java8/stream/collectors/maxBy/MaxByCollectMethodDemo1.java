package com.mm.java8.stream.collectors.maxBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxByCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mangesh", "Mayur");
		System.out.println("Original names list : " + names);

		String minName = names.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("name with max : " + minName);

		String minLengthName = names.stream()
			.collect(Collectors.maxBy((str1, str2) -> Integer.compare(str1.length(), str2.length())))
			.get();
		System.out.println("name with max length: " + minLengthName);
	}
}
