package com.mm.generics.class_example1;

public class TestApp {
	public static void main(String[] args) {
		// Box for Integer
		Box<Integer> integerBox = new Box<>(123);
		integerBox.displayContent();// Content: 123

		// Box for String
		Box<String> stringBox = new Box<>("Hello!");
		stringBox.displayContent();// Content: Hello!

		// Box for Student
		Box<Student> studentBox = new Box<>(new Student());
		studentBox.displayContent();// Content: Student [rollNumber=0, name=null]

		// Changing the content of the string box
		stringBox.setContent("Hi!");
		stringBox.displayContent();// Content: Hi!

		// Getting the content from the integer box
		System.out.println("Content: " + integerBox.getContent());// Content: 123
	}
}
