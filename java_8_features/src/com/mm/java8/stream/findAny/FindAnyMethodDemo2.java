package com.mm.java8.stream.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindAnyMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);
		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				return number % 2 == 0;
			}
		};

		Integer evenNumber = numbers.stream().filter(predicate).findAny().get();
		System.out.println("Find Any Even number from list : " + evenNumber);

		// using lambda expression
		Integer oddNumber = numbers.stream().filter(number -> number % 2 != 0).findAny().get();
		System.out.println("Find Any Even number from list : " + oddNumber);
	}
}
