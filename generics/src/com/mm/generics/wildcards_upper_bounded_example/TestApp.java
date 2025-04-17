package com.mm.generics.wildcards_upper_bounded_example;

import java.util.Arrays;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {

		UpperBoundWildcardExamples uppweWildCard = new UpperBoundWildcardExamples();

		// Bounded wildcard with an upper bound example
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Sum of numbers: " + uppweWildCard.sumOfNumbers(intList));
		// Sum of numbers : 15.0

		List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
		System.out.println("Sum of numbers: " + uppweWildCard.sumOfNumbers(doubleList));
		// Sum of numbers (upper bound): 6.6
	}
}
