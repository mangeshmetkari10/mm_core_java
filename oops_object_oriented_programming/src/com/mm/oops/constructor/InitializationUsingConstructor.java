package com.mm.oops.constructor;

public class InitializationUsingConstructor {

	public static void main(String[] args) {
		Student student1 = new Student("Raja", 101);
		Student student2 = new Student("Mangesh", 102);
		System.out.println(student1);
		System.out.println(student2);
	}
}

class Student {
	String name;
	int rollNumber;

	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
}
