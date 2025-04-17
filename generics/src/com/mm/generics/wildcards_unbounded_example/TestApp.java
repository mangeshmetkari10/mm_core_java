package com.mm.generics.wildcards_unbounded_example;

import java.util.Arrays;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {

		UnboundWildcardExamples wildcardExample = new UnboundWildcardExamples();
		List<String> stringList = Arrays.asList("A", "B", "C");
		System.out.println("Unbounded wildcard example:");
		wildcardExample.printList(stringList);// Unbounded wildcard example:
		// A
		// B
		// C
	}
}
