package com.mm.oops.flow_control;

public class Parent {

	int i = 10;
	{
		m1();
		System.out.println("Parent  block");
	}

	public static void main(String[] args) {

		Parent p = new Parent();
		p.m1();
		System.out.println("Parent main method");
	}

	public void m1() {
		System.out.println(j);
	}

	 int j = 20;
}