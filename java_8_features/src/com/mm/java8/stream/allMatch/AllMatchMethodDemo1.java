package com.mm.java8.stream.allMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham]
		Predicate<String> anyMatch = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				return t.length() == 7;
			}
		};
		System.out.println("Is all names length is 3 : " + names.stream().allMatch(anyMatch));
		// Is all names length is 3 : true
		System.out.println("Is all names starts with 'M' : " + names.stream().allMatch(name -> name.startsWith("M")));
		// Is all names starts with 'M' : false
	}
}
