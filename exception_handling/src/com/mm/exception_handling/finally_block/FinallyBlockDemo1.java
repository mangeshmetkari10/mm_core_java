package com.mm.exception_handling.finally_block;

public class FinallyBlockDemo1{

	public static void main(String[] args) {
		try {
		System.out.println("try");
		}catch (ArithmeticException e) {
			System.out.println("catch");
		}finally {
			System.out.println("Finally");
		}
		
	}
}
