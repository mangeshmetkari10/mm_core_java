package com.mm.generics.constructor_example1;

public class Pair {
	// Generic constructor with two type parameters
	<A, B> Pair(A first, B second) {
		System.out.println("First: " + first + ", Second: " + second);
	}
}
