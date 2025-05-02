package com.mm.java8.stream.dropWhile;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DropWhileMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Mahi", "Rohan", "Akash", "Mayur");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mangesh, Mahi, Rohan, Akash, Mayur]
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String name) {
				return name.startsWith("M");
			}
		};

		List<String> namesStartsWithM = names.stream().sorted().dropWhile(predicate).collect(Collectors.toList());
		System.out.println("Drop names statrs with M : " + namesStartsWithM);
		//Drop names statrs with M : [Akash, Mahi, Mangesh, Mayur, Rohan]
	}
}