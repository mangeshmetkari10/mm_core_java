package com.mm.exception_handling.top_10_expections;

public class IllegalArgumentExceptionExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Thread t = new Thread();
		t.setPriority(10);
		t.setPriority(200);
		

	}
}
