package com.mm.java8.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Function<Student, Student> function = (student) -> {
			student.name = student.name.toUpperCase();
			return student;
		};

		List<Student> nameLengthGreaterThan3 = students.stream().map(function).collect(Collectors.toList());
		System.out.println("List of Students with names in Upper case : " + nameLengthGreaterThan3);

		// using lambda expression
		List<Student> studentsNamesInUpperCase = students.stream().map((student) -> {
			student.name = student.name.toLowerCase();
			return student;
		}).collect(Collectors.toList());
		System.out.println("List of Student  with names in lower case : " + studentsNamesInUpperCase);

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