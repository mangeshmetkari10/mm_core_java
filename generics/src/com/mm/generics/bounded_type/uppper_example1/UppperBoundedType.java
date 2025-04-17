package com.mm.generics.bounded_type.uppper_example1;

import java.util.List;

public class UppperBoundedType {

	/*
	 * The method calculateSum is defined with a bounded type parameter <T extends
	 * Number>. This means that T can be any type that is a subclass of Number. The
	 * method calculates the sum of the elements in the list by converting each
	 * element to a double using the doubleValue() method.
	 */

	// Generic method with bounded type parameter
	public <T extends Number> double calculateSum(List<T> list) {
		double sum = 0.0;
		for (T number : list) {
			sum += number.doubleValue();
		}
		return sum;
	}
}