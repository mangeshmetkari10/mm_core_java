package com.mm.java8.stream.limit;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		List<Student> nameLengthGreaterThan3 = students.stream()
			.filter((student) -> student.rollNumber > 102)
			.limit(1)
			.collect(Collectors.toList());
		System.out.println("get 1 student details whose roll number >102: " + nameLengthGreaterThan3);

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