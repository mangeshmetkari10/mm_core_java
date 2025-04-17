package com.mm.generics.bounded_type.uppper_example1;

import java.util.Arrays;
import java.util.List;

public class TestApp {
	public static void main(String[] args) {

		UppperBoundedType boubdedType = new UppperBoundedType();

		// List of Integers
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		double intSum = boubdedType.calculateSum(intList);
		System.out.println("Sum: " + intSum);// Sum: 15.0

		// List of Doubles
		List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4);
		double doubleSum = boubdedType.calculateSum(doubleList);
		System.out.println("Sum : " + doubleSum);// Sum : 11.0

		// List of Floats
		List<Float> floatList = Arrays.asList(1.0f, 2.0f, 3.0f);
		double floatSum = boubdedType.calculateSum(floatList);
		System.out.println("Sum : " + floatSum);// Sum : 6.0
	}
}
