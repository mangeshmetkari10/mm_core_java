package com.mm.java8.stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodStringDemo {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);

		List<String> sortedNamesAsc = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted name list (natural sorting) : " + sortedNamesAsc);

		List<String> sortedNamesDesc = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Sorted name list (reverse sorting) : " + sortedNamesDesc);

	}

}