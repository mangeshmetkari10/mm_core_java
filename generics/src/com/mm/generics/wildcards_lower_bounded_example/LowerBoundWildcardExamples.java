package com.mm.generics.wildcards_lower_bounded_example;

import java.util.List;

public class LowerBoundWildcardExamples {

	/*
	 * Bounded wildcard with a lower bound example: accepts a list of Integer or its
	 * superclasses
	 */

	public void addIntegers(List<? super Integer> list) {
		list.add(1);
		list.add(2);
		list.add(3);
	}
}
