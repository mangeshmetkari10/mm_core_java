package com.mm.java8.optional;

public class OptionalClassDemoProblem {

	public static void main(String[] args) {

		Integer[] nums = new Integer[10];
		int num = nums[4].intValue();
		System.out.println(num);// java.lang.NullPointerException

	}
}
