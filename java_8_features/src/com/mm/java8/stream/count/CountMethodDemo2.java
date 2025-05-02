package com.mm.java8.stream.count;

import java.util.Arrays;
import java.util.List;

public class CountMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 7, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Original Number list :" + numbers);

		System.out.println("Count of  numbers     :" + numbers.stream().count());

	}
}
