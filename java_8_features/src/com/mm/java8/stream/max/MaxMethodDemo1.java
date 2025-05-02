package com.mm.java8.stream.max;

import java.util.Arrays;
import java.util.List;

public class MaxMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Akash", "Mayur");
		System.out.println("Original Names list : " + names);
		// Original Names list : [Mangesh, Rohan, Akash, Mayur]

		String nameMinLength = names.stream().max((s1, s2) -> {

			if (s1.length() > s2.length())
				return 1;
			else if (s1.length() < s2.length())
				return -1;
			else
				return 0;
		}).get();
		System.out.println("Names starts with Max lenght  : " + nameMinLength);
		// Names starts with Max lenght : Mangesh
	}
}
