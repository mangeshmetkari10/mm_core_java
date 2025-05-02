package com.mm.java8.stream.allMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AllMatchMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Predicate<? super Student> isAnyRollNumberAbove100 = new Predicate<Student>() {

			@Override
			public boolean test(Student student) {
				return student.rollNumber > 100;
			}
		};
		System.out
			.println("Is all student roll number are > 100 : " + students.stream().allMatch(isAnyRollNumberAbove100));

		System.out.println("Is all students names start with 'M' : "
				+ students.stream().allMatch(student -> student.name.startsWith("M")));

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