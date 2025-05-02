package com.mm.java8.stream.collectors.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByCollectMethodDemo3 {

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

		Map<Boolean, List<Student>> nameLengthGreaterThan3 = students.stream()
			.collect(Collectors.partitioningBy(predicate));
		System.out.println("map of Students whose name length > 3 and <3: " + nameLengthGreaterThan3);

		// using lambda expression
		Map<Boolean, List<Student>> studentsIdGreaterThan102 = students.stream()
			.collect(Collectors.partitioningBy((student) -> student.rollNumber > 102));
		System.out.println("List of Students whose roll number  is > 102 : " + studentsIdGreaterThan102);
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