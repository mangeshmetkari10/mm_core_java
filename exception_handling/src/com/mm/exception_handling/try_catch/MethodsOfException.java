package com.mm.exception_handling.try_catch;

public class MethodsOfException {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception toString method :" + e.toString());
			System.out.println("Exception getMessage method :" + e.getMessage());
			System.out.println("Exception printStackTrace method :");
			e.printStackTrace();
		}

	}

}
