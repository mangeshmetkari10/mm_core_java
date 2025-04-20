package com.mm.exception_handling.try_catch;

public class ExceptionWithTryCatch {

	public static void main(String[] args) {
		System.out.println("Execution started of main() method");
		try {
		System.out.println(10/0);
		}catch (ArithmeticException e) {
			System.out.println("Exception Handing using try catch and exception is :"+ e);
		}
		System.out.println("Execution completed of main() method");
	}
}
