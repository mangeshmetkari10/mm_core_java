package com.mm.exception_handling.finally_block;

public class FinallyBlockDemo3{

	public static void main(String[] args) {
		try {
		System.out.println("try");
		System.out.println(10/0);
		}catch (NullPointerException e) {
			System.out.println("catch");
		}finally {
			System.out.println("Finally");
		}
		
	}
}
