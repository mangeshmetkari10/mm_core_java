package com.mm.java8.stream.allMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);

		Predicate<Integer> isAnyEvenNumber = new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				return num % 2 == 0;
			}

		};

		System.out.println("Is all number is even : " + numbers.stream().allMatch(isAnyEvenNumber));

		System.out.println("Is all number are odd : " + numbers.stream().allMatch(num -> num % 2 != 0));

	}
}
