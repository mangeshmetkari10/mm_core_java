package com.mm.generics.enum_example;

public class TestApp {

	public static void main(String[] args) {

		double result1 = Operation.ADDITION.apply(10, 20);
		System.out.println(result1);

		double result2 = Operation.SUBTRACTION.apply(20, 10);
		System.out.println(result2);

		double result3 = Operation.DIVISION.apply(20, 10);
		System.out.println(result3);

		double result4 = Operation.MULTIPLICATION.apply(20, 10);
		System.out.println(result4);

	}

}
