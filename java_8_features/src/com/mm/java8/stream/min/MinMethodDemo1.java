package com.mm.java8.stream.min;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MinMethodDemo1 {

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

		List<String> namesStartsWithM = names.stream().filter(predicate).collect(Collectors.toList());
		System.out.println("Names starts with M : " + namesStartsWithM);

		String nameMinLength = names.stream().min((s1, s2) -> {

			if (s1.length() > s2.length())
				return 1;
			else if (s1.length() < s2.length())
				return -1;
			else
				return 0;
		}).get();
		System.out.println("Names with Min lenght  : " + nameMinLength);
		//Names with Min lenght  : Rohan
	}
}