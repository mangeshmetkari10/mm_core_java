package com.mm.java8.stream.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindAnyMethodDemo1 {

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

		String namesStartsWithM = names.stream().filter(predicate).findAny().get();
		System.out.println(" Find Any Name starts with M : " + namesStartsWithM);
		// Find Any Name starts with M : Mangesh
		String namesStartsWithA = names.stream().filter(name -> name.startsWith("A")).findAny().get();
		System.out.println(" Find Any Name starts with A : " + namesStartsWithA);
		// Find Any Name starts with A : Akash
	}
}
