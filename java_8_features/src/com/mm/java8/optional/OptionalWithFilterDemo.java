package com.mm.java8.optional;

import java.util.Optional;

public class OptionalWithFilterDemo {
	public static void main(String[] args) {
		Optional<Integer> optionalInt1 = Optional.of(23);

		// to get an Optional<Integer> which filters even number
		Optional<Integer> optionalInt2 = optionalInt1.filter(x -> x % 2 == 0);

		System.out.println(optionalInt2);// Optional.empty

		if (optionalInt2.isEmpty())
			System.out.println("is empty : " + optionalInt2);
		if (optionalInt1.isPresent())
			System.out.println("is present : " + optionalInt2);

		optionalInt1.ifPresent(num -> System.out.println("if present : " + optionalInt1));

		// to get an Optional<Integer> which filters odd number
		System.out.println(optionalInt2.filter(x -> x % 2 == 1));// Optional[23]
	}

}
