package com.mm.java8.default_method;

public class DefaultMethodInheritanceTestApp {

	public static void main(String[] args) {

		InterfaceOne one = new InterfaceOneInterfaceTwoImpl();
		one.methodOne();
	}
}
