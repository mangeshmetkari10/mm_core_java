package com.mm.generics.method_example3;

public class TestApp {
	public static void main(String[] args) {

		GenericMethodWithMultiParamter example = new GenericMethodWithMultiParamter();

		example.printTwoItems(10, "Apples"); // Output: 10 and Apples
		example.printTwoItems("Hello", 3.14); // Output: Hello and 3.14
	}
}
