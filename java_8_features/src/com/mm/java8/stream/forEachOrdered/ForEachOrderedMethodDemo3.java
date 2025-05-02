package com.mm.java8.stream.forEachOrdered;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachOrderedMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Consumer<? super Student> studentVsRollNumber = new Consumer<Student>() {

			@Override
			public void accept(Student t) {
				System.out.println(t.name + "/" + t.rollNumber);

			}

		};
		System.out.println("student details as name/rollnumber");
		students.stream().forEachOrdered(studentVsRollNumber);
	}
}

class Student {
	int rollNumber;
	String name;

	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + "]";
	}

}