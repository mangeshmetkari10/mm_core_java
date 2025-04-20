package com.mm.exception_handling.finally_block;

public class FinallyBlockDemoSystemExit {

	public static void main(String[] args) {
		try {
			System.out.println("try");
			System.exit(0);

		} catch (ArithmeticException e) {
			System.out.println("catch");
		} finally {
			System.out.println("Finally");
		}

	}
}
