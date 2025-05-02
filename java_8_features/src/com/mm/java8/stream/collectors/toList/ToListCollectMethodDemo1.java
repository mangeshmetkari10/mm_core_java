package com.mm.java8.stream.collectors.toList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original List : " + names);
		// Original List : [Mangesh, Shubham, Raj, Mayur]
		List<String> nameInUpperCase = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
		System.out.println("List Upper Case: " + nameInUpperCase);
		// List Upper Case: [MANGESH, SHUBHAM, RAJ, MAYUR]
		List<String> nameInLowerCase = names.stream().map((name) -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println("List Lower Case: " + nameInLowerCase);
		// List Lower Case: [mangesh, shubham, raj, mayur]
	}
}
