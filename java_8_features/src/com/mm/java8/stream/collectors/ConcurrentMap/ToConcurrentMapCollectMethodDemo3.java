package com.mm.java8.stream.collectors.ConcurrentMap;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToConcurrentMapCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("list : " + students);

		Function<Student, Integer> keyMapper = new Function<Student, Integer>() {

			@Override
			public Integer apply(Student student) {
				return student.rollNumber;
			}
		};
		Function<Student, Student> valueMapper = new Function<Student, Student>() {

			@Override
			public Student apply(Student t) {
				return t;
			}
		};
		ConcurrentMap<Integer, Student> mapRollNumberVsStudent = students.stream()
			.collect(Collectors.toConcurrentMap(keyMapper, valueMapper));
		System.out.println("ConcurrentMap RollNumber Vs Student : " + mapRollNumberVsStudent);

		ConcurrentMap<String, Student> mapNameVsStudent = students.stream()
			.collect(Collectors.toConcurrentMap(student -> student.name, student -> student));
		System.out.println("ConcurrentMap Name Vs Student: " + mapNameVsStudent);

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

	@Override
	public boolean equals(Object obj) {

		Student student = (Student) obj;
		if (student.name.equals(this.name) && student.rollNumber == this.rollNumber)
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return 31 + this.name.hashCode() + rollNumber;
	}
}