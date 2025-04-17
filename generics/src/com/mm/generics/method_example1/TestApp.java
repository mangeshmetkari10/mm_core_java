package com.mm.generics.method_example1;

import java.util.Arrays;

public class TestApp {
	public static void main(String[] args) {

		GenericMethod example = new GenericMethod();
		// Swapping elements in an Integer array
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("Before : " + Arrays.toString(intArray));
		example.swap(intArray, 0, 3);
		System.out.println("After :" + Arrays.toString(intArray));
		// Output:
		// Before swap: [1, 2, 3, 4, 5]
		// After swap: [1, 4, 3, 2, 5]

		// Swapping elements in a String array
		String[] strArray = { "A", "B", "C", "D", "E" };
		System.out.println("Before : " + Arrays.toString(strArray));
		example.swap(strArray, 0, 4);
		System.out.println("After: " + Arrays.toString(strArray));
		// Output:
		// Before swap: [A, B, C, D, E]
		// After swap: [E, B, C, D, A]
	}
}
