package com.mm.java8.stream.noneMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NoneMatchMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Shubham, Raj, Mayur]
		Predicate<String> noneMatcher = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				return t.length() < 2;
			}
		};
		System.out.println("Is no names length is < 2: " + names.stream().noneMatch(noneMatcher));
		//Is no names length is < 2: true
		System.out.println("Is no names starts with 'M' : " + names.stream().noneMatch(name -> name.startsWith("M")));
		//Is no names starts with 'M' : false
	}
}