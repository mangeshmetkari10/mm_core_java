package com.mm.exception_handling.top_10_expections;

@SuppressWarnings("null")
public class ExceptionInInitializerErrorExample {

	static {
		String s = null;
		System.out.println(s.length());
	}
	public static void main(String[] args) {
	}
}
