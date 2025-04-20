package com.mm.exception_handling.top_10_expections;

public class NumberFormatExceptionExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = Integer.parseInt("10");
		int j = Integer.parseInt("ten");

	}
}
