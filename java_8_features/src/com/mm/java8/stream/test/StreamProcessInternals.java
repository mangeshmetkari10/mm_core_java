package com.mm.java8.stream.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamProcessInternals {
	public static void main(String[] args) {
		Integer[] numbers = { 1, 2, 3 };
		Stream<Integer> streamOfIntegers = Arrays.stream(numbers);
		streamOfIntegers
		.peek(num -> System.out.println("Processing number : " + num))
		.filter(num -> {
			System.out.println("applying filter condition number : " + num);
			return num > 2;
		}).forEach(num -> {
			System.out.println("forEach :Printing the number: " + num);
			System.out.println(num);
		});
	}
}
