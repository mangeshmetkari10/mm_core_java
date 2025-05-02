package com.mm.java8.stream.anyMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Predicate<? super Student> isAllRollNumberAbove100 = new Predicate<Student>() {

			@Override
			public boolean test(Student student) {
				return student.rollNumber > 100;
			}
		};
		System.out.println(
				"Is any student roll number are > 100 : " + students.stream().anyMatch(isAllRollNumberAbove100));

		System.out.println("Is any students names start with 'M' : "
				+ students.stream().anyMatch(student -> student.name.startsWith("M")));

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