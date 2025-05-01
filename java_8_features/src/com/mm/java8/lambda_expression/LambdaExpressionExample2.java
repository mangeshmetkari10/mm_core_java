package com.mm.java8.lambda_expression;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {

		Addition interface1 = new AdditionImpl();
		interface1.add(10, 20);//impl class : 30

		Addition interface2 = (a, b) -> {
			System.out.println("lambda expression : " + (a + b));
		};
		interface2.add(100, 200);//lambda expression : 300
	}
}

interface Addition {
	public void add(int a, int b);
}

class AdditionImpl implements Addition {
	@Override
	public void add(int a, int b) {
		System.out.println("impl class : " + (a + b));
	}
}
