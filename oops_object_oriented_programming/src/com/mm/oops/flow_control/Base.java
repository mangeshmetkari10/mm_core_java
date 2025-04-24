package com.mm.oops.flow_control;

public class Base {

	static int i = 10;
	static {
		m1();
		System.out.println("Base static block");
	}

	public static void main(String[] args) {

		m1();
		System.out.println("Base main method");
	}

	public static void m1() {
		System.out.println(j);
	}

	static int j = 20;
}