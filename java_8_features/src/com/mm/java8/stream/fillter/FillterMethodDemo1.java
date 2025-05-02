package com.mm.java8.stream.fillter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FillterMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Akash", "Mayur");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mangesh, Rohan, Akash, Mayur]
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String name) {
				return name.startsWith("M");
			}
		};

		List<String> namesStartsWithM = names.stream()
				.filter(predicate).collect(Collectors.toList());
		System.out.println("Names starts with M : " + namesStartsWithM);
		//Names starts with M : [Mangesh, Mayur]
		// using lambda expression
		List<String> namesStartsWithA = names.stream()
			.filter((name) -> name.startsWith("A"))
			.collect(Collectors.toList());
		System.out.println("Names starts with M : " + namesStartsWithA);
		//Names starts with M : [Akash		
	}
}
