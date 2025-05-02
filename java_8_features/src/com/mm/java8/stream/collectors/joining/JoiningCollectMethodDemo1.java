package com.mm.java8.stream.collectors.joining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original list : " + names);
		// Original list : [Mangesh, Shubham, Raj, Mayur]
		String concatenatedString = names.stream().map(name -> name.toUpperCase()).collect(Collectors.joining());
		System.out.println("concatenated String: " + concatenatedString);
		// concatenated String: MANGESHSHUBHAMRAJMAYUR
		String concatenatedStringWithDelimeter = names.stream()
			.map(name -> name.toUpperCase())
			.collect(Collectors.joining("_"));
		System.out.println("concatenated String with delimeter: " + concatenatedStringWithDelimeter);
		// concatenated String with delimiter: MANGESH_SHUBHAM_RAJ_MAYUR
		String concatenatedStringWithDelimeterPrefixAndSuffix = names.stream()
			.map(name -> name.toUpperCase())
			.collect(Collectors.joining("_", "@", "*"));
		System.out.println("concatenated String with delimeter prefix and suffix: "
				+ concatenatedStringWithDelimeterPrefixAndSuffix);
		// concatenated String with delimiter prefix and suffix: @MANGESH_SHUBHAM_RAJ_MAYUR*
	}
}
