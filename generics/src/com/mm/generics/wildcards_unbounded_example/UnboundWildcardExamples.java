package com.mm.generics.wildcards_unbounded_example;

import java.util.List;

public class UnboundWildcardExamples {
	// Unbounded wildcard example: accepts a list of any type
	public void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
