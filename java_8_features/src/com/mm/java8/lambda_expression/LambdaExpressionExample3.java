package com.mm.java8.lambda_expression;

public class LambdaExpressionExample3 {

	public static void main(String[] args) {

		Square interface1 = new SquareImpl();
		int square1 = interface1.square(10);
		System.out.println("square from impl class : " + square1);//square from impl class : 100
		Square interface2 = (a) -> a * a;
		int square2 = interface2.square(100);
		System.out.println("square from lambda : " + square2);//square from lambda : 10000
	}
}

interface Square {
	public int square(int a);
}

class SquareImpl implements Square {
	@Override
	public int square(int a) {
		return a * a;
	}
}
