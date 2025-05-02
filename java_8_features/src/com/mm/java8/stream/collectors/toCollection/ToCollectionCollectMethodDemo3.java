package com.mm.java8.stream.collectors.toCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ToCollectionCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(101, "Mangesh"), new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Supplier<List<Student>> collectionFactory = new Supplier<List<Student>>() {

			@Override
			public List<Student> get() {
				return new ArrayList<Student>();
			}
		};
		
		List<Student> studentsNamesInUpperCase = students.stream().map((student) -> {
			student.name = student.name.toLowerCase();
			return student;
		}).collect(Collectors.toCollection(collectionFactory));
		System.out.println("List of Student  with names in lower case : " + studentsNamesInUpperCase);

		Set<Student> nameLengthGreaterThan3 = students.stream().map((student) -> {
			student.name = student.name.toUpperCase();
			return student;
		}).collect(Collectors.toCollection(HashSet::new));
		System.out.println("Set of Students with names in Upper case : " + nameLengthGreaterThan3);

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