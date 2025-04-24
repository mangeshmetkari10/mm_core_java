package com.mm.oops.overrding;

public class Addition extends Operation {

	@Override
	public void add(int a, int b) {
		System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));

	}
}
