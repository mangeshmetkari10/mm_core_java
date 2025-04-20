package com.mm.exception_handling.top_10_expections;

public class NullPointerExceptionExample {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		System.out.println(str.length());
	}
}
