package com.mm.java8.stream.takeWhile;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TakeWhileMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);
		Predicate<Integer> predicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				return number % 2 == 0;
			}
		};

		List<Integer> namesStartsWithM = numbers.stream().takeWhile(predicate).collect(Collectors.toList());
		System.out.println("take all the intital even number until 1st odd number : " + namesStartsWithM);
	}
}
