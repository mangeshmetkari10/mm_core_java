package com.mm.java8.stream.takeWhile;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TakeWhileMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mahi", "Mangesh", "Rohan", "Akash", "Mayur");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mahi, Mangesh, Rohan, Akash, Mayur]
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String name) {
				return name.startsWith("M");
			}
		};

		List<String> namesStartsWithM = names.stream().takeWhile(predicate).collect(Collectors.toList());
		System.out.println("take all the initial names starts with M until any other name : " + namesStartsWithM);
		//take all the initial names starts with M until any other name : [Mahi, Mangesh]
	}
}