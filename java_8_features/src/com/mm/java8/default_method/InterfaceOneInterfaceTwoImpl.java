package com.mm.java8.default_method;

public class InterfaceOneInterfaceTwoImpl implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodOne() {
		InterfaceOne.super.methodOne();
	}
}
