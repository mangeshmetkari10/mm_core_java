package com.mm.generics.interface_example2;

public class TestApp {
	public static void main(String[] args) {

		// Creating a Box for String
		Container<String> stringBox = new Box();
		stringBox.set("Hello!");
		System.out.println("Content: " + stringBox.get());// Content: Hello!

	}
}
