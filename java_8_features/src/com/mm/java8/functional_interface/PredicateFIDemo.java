package com.mm.java8.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFIDemo {

	public static void main(String[] args) {

		Predicate<String> predicate = (s) -> s.length() == 9;
		List<String> list = Arrays.asList("Predicate", "Function", "Consumer", "Supplier");
		list.forEach(x -> {
			if (predicate.test(x)) {
				System.out.println(x);// Predicate
			}
		});

	}
}
