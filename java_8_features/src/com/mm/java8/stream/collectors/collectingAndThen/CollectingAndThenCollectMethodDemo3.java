package com.mm.java8.stream.collectors.collectingAndThen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectingAndThenCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Function<Student, Student> function = (student) -> {
			student.name = student.name.toUpperCase();
			return student;
		};

		String nameUpperCaseString = students.stream()
			.map(function)
			.collect(Collectors.collectingAndThen(Collectors.toList(),
					list -> list.stream().map(student -> student.name).collect(Collectors.joining(", "))));
		;
		System.out.println("String of Students with names in Upper case : " + nameUpperCaseString);

		// using lambda expression
		String name_rollNumberString = students.stream().map((student) -> {
			student.name = student.name.toLowerCase();
			return student;
		})
			.collect(Collectors.collectingAndThen(Collectors.toList(),
					list -> list.stream()
						.map(student -> student.name + "-" + student.rollNumber)
						.collect(Collectors.joining(","))));
		System.out.println("String of Student  with names-rollnumber in lower case : " + name_rollNumberString);

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