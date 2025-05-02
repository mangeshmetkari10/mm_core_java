package com.mm.java8.stream.collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mangesh", "Mayur");
		System.out.println("Original list : " + names);
		//Original list : [Mangesh, Shubham, Raj, Mangesh, Mayur]
		Set<String> upperCaseSet = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toSet());
		System.out.println("Set Upper Case: " + upperCaseSet);
		//Set Upper Case: [MAYUR, MANGESH, RAJ, SHUBHAM]
		Set<String> lowerCaseSet = names.stream().map((name) -> name.toLowerCase()).collect(Collectors.toSet());
		System.out.println("Set Lower Case: " + lowerCaseSet);
		//Set Lower Case: [shubham, mangesh, raj, mayur]
	}
}
