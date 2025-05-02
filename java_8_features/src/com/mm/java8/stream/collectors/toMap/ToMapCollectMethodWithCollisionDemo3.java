package com.mm.java8.stream.collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapCollectMethodWithCollisionDemo3 {

	public static void main(String[] args) {

		List<StudentNew> students = Arrays.asList(new StudentNew(101, "Mangesh"), new StudentNew(102, "Shubham"),
				new StudentNew(104, "Raj"), new StudentNew(101, "Mangesh"), new StudentNew(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Function<StudentNew, Integer> keyMapper = new Function<StudentNew, Integer>() {

			@Override
			public Integer apply(StudentNew student) {
				return student.rollNumber;
			}
		};
		Function<StudentNew, StudentNew> valueMapper = new Function<StudentNew, StudentNew>() {

			@Override
			public StudentNew apply(StudentNew t) {
				return t;
			}
		};
		BinaryOperator<StudentNew> mergeFuction = new BinaryOperator<StudentNew>() {

			@Override
			public StudentNew apply(StudentNew key, StudentNew identicalKey) {
				return identicalKey;
			}
		};
		Map<Integer, StudentNew> mapRollNumberVsStudent = students.stream()
			.collect(Collectors.toMap(keyMapper, valueMapper, mergeFuction));
		System.out.println("List of Student  with names in lower case : " + mapRollNumberVsStudent);

		Map<String, StudentNew> mapNameVsStudent = students.stream()
			.collect(Collectors.toMap(student -> student.name, student -> student, (key, IdeneticalKey) -> key));
		System.out.println("Set of Students with names in Upper case : " + mapNameVsStudent);

	}
}

class StudentNew {
	int rollNumber;
	String name;

	public StudentNew(int rollNumber, String name) {
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

		StudentNew student = (StudentNew) obj;
		if (student.name.equals(this.name) && student.rollNumber == this.rollNumber)
			return true;
		return false;

	}

	@Override
	public int hashCode() {

		return 31 + this.name.hashCode() + rollNumber;
	}
}