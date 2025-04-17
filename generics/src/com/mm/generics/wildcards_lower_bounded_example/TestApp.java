package com.mm.generics.wildcards_lower_bounded_example;

import java.util.ArrayList;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {

		LowerBoundWildcardExamples lowerBound = new LowerBoundWildcardExamples();

		// Bounded wildcard with a lower bound example
		List<Number> numberList = new ArrayList<>();

		lowerBound.addIntegers(numberList);

		for (Number num : numberList) {
			System.out.println(num);// 1 2 3
		}

	}
}
