package com.mm.java8.default_method;

public class DefaultMethodTestApp {

	public static void main(String[] args) {

		InterfaceOne interfaceOne = new InterfaceOneImpl1();
		interfaceOne.methodOne();

		InterfaceOne interfaceOne2 = new InterfaceOneImpl2();
		interfaceOne2.methodOne();
	}
}
