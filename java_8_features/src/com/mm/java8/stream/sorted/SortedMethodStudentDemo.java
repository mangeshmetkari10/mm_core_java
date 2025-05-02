package com.mm.java8.stream.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethodStudentDemo {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		List<Student> sortedStudentAsc = students.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted student  list (natural sorting) by roll number : " + sortedStudentAsc);

		List<Student> sortedStudentDesc = (List<Student>) students.stream()
			.sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
		System.out.println("Sorted student list (reverse sorting) by roll number : " + sortedStudentDesc);

		List<Student> sortedStudentAscName = students.stream()
			.sorted((student1, student2) -> student1.name.compareTo(student2.name))
			.collect(Collectors.toList());

		System.out.println("Sorted student  list (natural sorting)by roll name : " + sortedStudentAscName);

		List<Student> sortedStudentDescName = students.stream()
			.sorted((student1, student2) -> -student1.name.compareTo(student2.name))
			.collect(Collectors.toList());
		System.out.println("Sorted student list (reverse sorting) by roll name: " + sortedStudentDescName);

	}
}

class Student implements Comparable<Student> {
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
	public int compareTo(Student student) {

		int rollNumber = student.rollNumber;

		if (this.rollNumber > rollNumber)
			return 1;
		else if (this.rollNumber < rollNumber)
			return -1;
		else
			return 0;
	}
}