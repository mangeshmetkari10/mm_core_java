package com.mm.generics.interface_example1;

public class TestApp {
	public static void main(String[] args) {
		// Creating a Box for Integer
		Container<Integer> intBox = new Box<>();
		intBox.set(123);
		System.out.println("Content: " + intBox.get());// Content: 123

		// Creating a Box for String
		Container<String> str1Box = new Box<>();
		str1Box.set("Hello!");
		System.out.println("Content: " + str1Box.get());// Content: Hello!

		// Creating a Box for Student
		Student student = new Student(101, "Sangram");
		Container<Student> studBox = new Box<>();
		studBox.set(student);
		System.out.println("Content: " + studBox.get());// Content: Student [rollNumber=101, name=Sangram]

		// Displaying content using the Box's method
		Box<String> str2Box = new Box<>();
		str2Box.set("Hi");
		str2Box.displayContent();// Content: Hi
	}
}
