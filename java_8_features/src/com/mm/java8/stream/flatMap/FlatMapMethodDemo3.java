package com.mm.java8.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMethodDemo3 {

	public static void main(String[] args) {

		List<List<Student>> students = Arrays.asList(
				Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham")),
				Arrays.asList(new Student(104, "Raj"), new Student(103, "Mayur")));
		System.out.println("Original Students list : " + students);

		List<List<Student>> listWithMap = students.stream().map(stud -> stud).collect(Collectors.toList());
		System.out.println("List of Students with map : " + listWithMap);

		// using lambda expression
		List<Student> listWithFlatMap = students.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("List of Student  with flatMap : " + listWithFlatMap);

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