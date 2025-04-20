package com.mm.exception_handling.top_10_expections;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
		methodOne();
	}

	private static void methodOne() {
		methodTwo();
		
	}

	private static void methodTwo() {
		methodOne();
		
	}
}
