package com.mm.exception_handling.top_10_expections;

public class StackOverFlowExceptionExample {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		System.out.println(numbers[0]);
		System.out.println(numbers[22]);
	}
}
