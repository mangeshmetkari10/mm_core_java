package com.mm.java8.optional;

import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {

		Optional<String> myString = Optional.of("My string");
		Optional<String> noString = Optional.empty();
		System.out.println(myString.map(String::toLowerCase));// Optional[my string]
		System.out.println(noString.map(String::toLowerCase));// Optional.empty
		Optional<Optional<String>> anotherOptionalString = Optional.of(Optional.of("My another string"));
		System.out.println(anotherOptionalString.map(anotherString -> anotherString.map(String::toUpperCase))); // Optional[Optional[MY
																												// ANOTHER
																												// STRING]]
		System.out.println(anotherOptionalString.flatMap(anotherString -> anotherString.map(String::toLowerCase))); // Optional[my
																													// another
	}

}
