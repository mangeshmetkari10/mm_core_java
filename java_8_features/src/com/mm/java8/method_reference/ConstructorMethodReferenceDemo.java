package com.mm.java8.method_reference;

public class ConstructorMethodReferenceDemo {

	public static void main(String[] args) {

		MyInterface interface1 = new MyInterfaceImpl();
		interface1.get("Raja");// Traditional Approach : Raja

		MyInterface interface2 = Sample::new;
		interface2.get("Mangesh");// Method Reference : Mangesh

	}

	public void sum(int a, int b) {
		System.out.println("Method Reference sum : " + (a + b));
	}
}

interface MyInterface {
	public void get(String s);
}

class MyInterfaceImpl implements MyInterface {
	public void get(String s) {
		System.out.println("Traditional Approach : " + s);
	}
}

class Sample {

	String s;

	public Sample(String s) {
		this.s = s;
		System.out.println("Method Reference : " + s);
	}
}
