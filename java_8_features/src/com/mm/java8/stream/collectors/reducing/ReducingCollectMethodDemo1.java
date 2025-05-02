package com.mm.java8.stream.collectors.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ReducingCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mayur]
		BinaryOperator<String> fucntion = new BinaryOperator<String>() {

			@Override
			public String apply(String t, String u) {
				return t + " " + u;
			}
		};
		String recudcedString = names.stream().collect(Collectors.reducing(fucntion)).get();
		System.out.println("reduced by concatnaing : " + recudcedString);
		// reduced by concatnaing : Mangesh Shubham Raj Mayur
		String recudcedStringWithIntialValue = names.stream()
			.collect(Collectors.reducing("Java_", (name1, name2) -> name1 + name2));
		System.out.println("reduced names by concatnaing : " + recudcedStringWithIntialValue);
		// reduced names by concatnaing : Java_MangeshShubhamRajMayur
		String recudcedStringWithIntialValue1 = names.stream()
			.collect(Collectors.reducing("", s -> s.toUpperCase(), (t, u) -> t + " " + u));
		System.out.println("reduced names by concatnaing : " + recudcedStringWithIntialValue1);
		// reduced names by concatnaing : MANGESH SHUBHAM RAJ MAYUR
	}
}