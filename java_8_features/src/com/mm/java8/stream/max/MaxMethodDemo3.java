package com.mm.java8.stream.max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Comparator<Student> intComparator = new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.rollNumber.compareTo(o2.rollNumber);
			}
		};

		Student minRollNumberStudent = students.stream().max(intComparator).get();
		System.out.println("Student with max roll number : " + minRollNumberStudent);

		Student studentNameWithMinLength = students.stream().max((s1, s2) -> {

			if (s1.name.length() > s2.name.length())
				return 1;
			else if (s1.name.length() < s2.name.length())
				return -1;
			else
				return 0;
		}).get();
		System.out.println("Student with max length of name : " + studentNameWithMinLength);
	}
}

class Student {
	Integer rollNumber;
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