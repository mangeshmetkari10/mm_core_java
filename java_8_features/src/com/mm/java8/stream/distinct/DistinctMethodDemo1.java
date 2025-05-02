package com.mm.java8.stream.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Akash", "Mayur", "Rohan", "Raja");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mangesh, Rohan, Akash, Mayur, Rohan, Raja]
		List<String> namesStartsWithM = names.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Names  : " + namesStartsWithM);
		//Distinct Names  : [Mangesh, Rohan, Akash, Mayur, Raja]
	}
}
