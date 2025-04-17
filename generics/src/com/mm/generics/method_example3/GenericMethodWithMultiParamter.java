package com.mm.generics.method_example3;

public class GenericMethodWithMultiParamter {

	public <T, U> void printTwoItems(T item1, U item2) {
		System.out.println(item1 + " and " + item2);
	}

}
