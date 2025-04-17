package com.mm.generics.constructor_example3;

public class TestApp {
	public static void main(String[] args) {
		new NumberPrinter(100); // Integer is a subclass of Number
		new NumberPrinter(3.14); // Double is a subclass of Number

		// The following would cause a compile-time error because 
		// String is not a subclass of Number
		// new NumberPrinter("Hello");
	}
}
