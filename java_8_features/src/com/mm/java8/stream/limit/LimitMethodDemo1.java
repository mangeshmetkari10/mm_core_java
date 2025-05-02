package com.mm.java8.stream.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Madhuri", "Akash", "Mayur");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mangesh, Rohan, Madhuri, Akash, Mayur]
		List<String> namesStartsWithM = names.stream()
			.filter(name -> name.startsWith("M"))
			.limit(2)
			.collect(Collectors.toList());
		System.out.println("2 names starts with M : " + namesStartsWithM);
		//2 names starts with M : [Mangesh, Madhuri]
	}
}
