package com.mm.oops.overloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		MethodOverloadingDemo demo = new MethodOverloadingDemo();
		demo.add(10, 20);
		demo.add(22.1f, 22.0f);
		demo.add(22.1, 22.0);
		demo.add(12.2, 2);
		demo.add('M', 'm');
	}

	public void add(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
		;
	}

	public void add(float a, float b) {
		System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
		;
	}

	public void add(double a, double b) {
		System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
		;
	}

	public void add(long a, long b) {
		System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
		;
	}

}
