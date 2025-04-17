package com.mm.generics.constructor_example3;

public class NumberPrinter {
	// Bounded type parameter for generic constructor
	<T extends Number> NumberPrinter(T number) {
		System.out.println("Number: " + number);
	}
}
