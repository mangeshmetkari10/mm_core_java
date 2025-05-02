package com.mm.java8.stream.noneMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NoneMatchMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Predicate<Integer> isAllEvenNumber = new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}

		};

		System.out.println("Is none numbers are even : " + numbers.stream().noneMatch(isAllEvenNumber));

		System.out
				.println("Is none numbers are integers : " + numbers.stream().noneMatch(num -> num instanceof Integer));

	}
}
