package com.mm.java8.stream.count;

import java.util.Arrays;
import java.util.List;

public class CountMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Akash", "Mayur", "Raja");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mangesh, Rohan, Akash, Mayur, Raja]
		System.out.println("counts of Names  : " + names.stream().count());
		//counts of Names  : 5
	}
}
