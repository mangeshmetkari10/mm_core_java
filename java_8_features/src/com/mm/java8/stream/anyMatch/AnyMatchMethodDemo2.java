package com.mm.java8.stream.anyMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Predicate<Integer> isAllEvenNumber = new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}

		};

		System.out.println("Is any numbers are even : " + numbers.stream().anyMatch(isAllEvenNumber));

		System.out.println("Is any numbers are integers : " + numbers.stream().anyMatch(num -> num instanceof Integer));

	}
}
