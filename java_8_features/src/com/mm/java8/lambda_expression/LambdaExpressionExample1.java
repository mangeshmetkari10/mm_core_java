package com.mm.java8.lambda_expression;

public class LambdaExpressionExample1 {

	public static void main(String[] args) {

		MyInterface interface1 = new MyInterfaceImpl();
		interface1.methodOne();// method one from implementation class

		MyInterface interface2 = () -> System.out.println("methodOne()from lambda expression");
		interface2.methodOne();// methodOne()from lambda expression
	}
}

interface MyInterface {
	public void methodOne();
}

class MyInterfaceImpl implements MyInterface {
	public void methodOne() {
		System.out.println("method one from implementation class");
	}
}
