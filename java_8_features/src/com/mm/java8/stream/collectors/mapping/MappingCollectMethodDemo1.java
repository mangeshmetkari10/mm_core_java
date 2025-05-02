package com.mm.java8.stream.collectors.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MappingCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mayur]

		Function<String, String> mapper = new Function<String, String>() {

			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		};

		List<String> mappingToUpperCase = names.stream().collect(Collectors.mapping(mapper, Collectors.toList()));
		System.out.println("mapping names to upper case List : " + mappingToUpperCase);
		// mapping names to upper case List : [MANGESH, SHUBHAM, RAJ, MAYUR]
		Set<String> mappingToLowerCase = names.stream()
			.collect(Collectors.mapping(name -> name.toLowerCase(), Collectors.toSet()));
		System.out.println("mapping names to upper case List : " + mappingToLowerCase);
		// mapping names to upper case List : [shubham, mangesh, raj, mayur]
	}
}
