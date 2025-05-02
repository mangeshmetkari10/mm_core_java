package com.mm.java8.stream.collectors.reducing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReducingCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh", 76), new Student(102, "Shubham", 87),
				new Student(101, "Mangesh", 76), new Student(104, "Raj", 56), new Student(103, "Mayur", 65));
		System.out.println("Original Students list : " + students);

		Student studentWithMaxId = students.stream().collect(Collectors.reducing((student1, student2) -> {
			if (student1.marks > student2.marks)
				return student1;
			else
				return student2;
		})).get();

		System.out.println("Student details of max marks : " + studentWithMaxId);

		int totalMarks = students.stream()
			.collect(Collectors.reducing(0, st -> st.marks, (marks1, marks2) -> marks1 + marks2));

		System.out.println("Students total marks : " + totalMarks);

	}
}

class Student {
	int rollNumber;
	String name;
	int marks;

	public Student(int rollNumber, String name, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public boolean equals(Object obj) {

		Student student = (Student) obj;
		if (student.name.equals(this.name) && student.rollNumber == this.rollNumber && student.marks == this.marks)
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return 31 + this.name.hashCode() + rollNumber + marks;
	}
}