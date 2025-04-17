package com.mm.generics.constructor_example2;

public class Test<T> {
	private T value;

	// Generic constructor
	public <U> Test(U input) {
		System.out.println(input.getClass().getName());
	}
}
