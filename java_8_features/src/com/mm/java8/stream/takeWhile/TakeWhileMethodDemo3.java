package com.mm.java8.stream.takeWhile;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TakeWhileMethodDemo3 {

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Predicate<Student> predicate = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {

				return t.name.length() > 3;
			}

		};

		List<Student> nameLengthGreaterThan3 = students.stream().takeWhile(predicate).collect(Collectors.toList());
		System.out.println("take all the students until name length > 3: " + nameLengthGreaterThan3);

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