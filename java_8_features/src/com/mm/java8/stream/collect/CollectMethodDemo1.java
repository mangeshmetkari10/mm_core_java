package com.mm.java8.stream.collect;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Shubham, Raj, Mayur]
		Function<String, String> function = new Function<String, String>() {

			@Override
			public String apply(String name) {
				return name.toUpperCase();
			}
		};
		List<String> nameInUpperCase = names.stream().map(function).collect(Collectors.toList());
		System.out.println("List of In Upper Case: " + nameInUpperCase);
		//List of In Upper Case: [MANGESH, SHUBHAM, RAJ, MAYUR]
		List<String> nameInLowerCase = names.stream().map((name) -> name.toLowerCase()).collect(Collectors.toList());
		System.out.println("List of In Lower Case: " + nameInLowerCase);
		//List of In Lower Case: [mangesh, shubham, raj, mayur]
	}
}