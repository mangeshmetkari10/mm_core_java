package com.mm.java8.stream.collectors.toCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ToCollectionCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Mayur");
		System.out.println("Original list : " + names);
		//Original list : [Mangesh, Shubham, Mayur]
		Supplier<Set<String>> collectionFactory = new Supplier<Set<String>>() {

			@Override
			public Set<String> get() {
				return new HashSet<String>();
			}
		};
		Set<String> nameInUpperCase = names.stream()
			.map(name -> name.toUpperCase())
			.collect(Collectors.toCollection(collectionFactory));
		System.out.println("Set Upper Case: " + nameInUpperCase);
		//Set of In Upper Case: [MAYUR, MANGESH, SHUBHAM]
		List<String> nameInLowerCase = names.stream()
			.map((name) -> name.toLowerCase())
			.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("List Lower Case: " + nameInLowerCase);
		//List of In Lower Case: [mangesh, shubham, mayur]
	}
}
