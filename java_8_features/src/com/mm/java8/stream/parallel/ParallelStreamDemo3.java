package com.mm.java8.stream.parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		System.out.println("Sequential Stream Output:");
		students.stream().map(n -> n.name.toUpperCase()).forEach(System.out::println);

		System.out.println("Parallel Stream Output:");
		students.stream().parallel().map(n -> n.name.toUpperCase()).forEach(System.out::println);

		System.out.println("Sequential Stream Output:");
		students.stream().filter(n -> n.rollNumber > 102).forEach(System.out::println);

		System.out.println("Parallel Stream Output:");
		students.parallelStream().filter(n -> n.rollNumber > 102).forEach(System.out::println);
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