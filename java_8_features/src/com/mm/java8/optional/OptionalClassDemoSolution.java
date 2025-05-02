package com.mm.java8.optional;

import java.util.Optional;

public class OptionalClassDemoSolution {

	public static void main(String[] args) {

		Integer[] nums = new Integer[10];

		// Wrapping the element at index 4 in an Optional object
		Optional<Integer> maybeInt = Optional.ofNullable(nums[4]);
		if (maybeInt.isPresent()) {
			int num1 = nums[4].intValue();
			System.out.println(num1);// int value not present
		} else {
			System.out.println("int value not present");
		}
	}
}
