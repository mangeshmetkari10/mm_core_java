package com.mm.generics.wildcards_upper_bounded_example;

import java.util.List;

public class UpperBoundWildcardExamples {

	/*
	 * Bounded wildcard with an upper bound example: accepts a list of Number or its
	 * subclasses
	 */

	public double sumOfNumbers(List<? extends Number> list) {
		double sum = 0.0;
		for (Number num : list) {
			sum += num.doubleValue();
		}
		return sum;
	}
}
