package com.mm.java8.stream.collectors.maxBy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxByCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(101, "Mangesh"), new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Student maxRollNumberStudent = students.stream()
			.collect(Collectors.maxBy((s1, s2) -> Integer.compare(s1.rollNumber, s2.rollNumber)))
			.get();
		System.out.println("Student details with max roll number  : " + maxRollNumberStudent);
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

	@Override
	public boolean equals(Object obj) {

		Student student = (Student) obj;
		if (student.name.equals(this.name) && student.rollNumber == this.rollNumber)
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return 31 + this.name.hashCode() + rollNumber;
	}
}