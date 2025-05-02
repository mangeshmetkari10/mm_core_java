package com.mm.java8.stream.anyMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Shubham, Raj, Mayur]
		Predicate<String> allMatcher = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				return t.length() > 2;
			}
		};
		System.out.println("Is any names length is > 2: " + names.stream().anyMatch(allMatcher));
		//Is any names length is > 2: true
		System.out.println("Is any names starts with 'M' : " + names.stream().anyMatch(name -> name.startsWith("M")));
		//Is any names starts with 'M' : true
	}
}