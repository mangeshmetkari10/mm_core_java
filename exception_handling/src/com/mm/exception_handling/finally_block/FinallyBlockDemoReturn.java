package com.mm.exception_handling.finally_block;

public class FinallyBlockDemoReturn {

	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try {
			System.out.println("try");
			return;

		} catch (ArithmeticException e) {
			System.out.println("catch");
			return;
		} finally {
			System.out.println("Finally");
			return;
		}

	}
}
