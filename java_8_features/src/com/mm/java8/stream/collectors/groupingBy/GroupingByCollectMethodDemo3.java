package com.mm.java8.stream.collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"), new Student(101, "Raja"),
				new Student(102, "Mangesh"));
		System.out.println("Original Students list : " + students);

		Function<Student, Integer> keyMapper = new Function<Student, Integer>() {

			@Override
			public Integer apply(Student student) {
				return student.rollNumber;
			}
		};

		Map<Integer, List<Student>> mapRollNumberVsStudent = students.stream()
			.collect(Collectors.groupingBy(keyMapper));
		System.out.println("grouping By roll numbers : " + mapRollNumberVsStudent);

		Map<Integer, Set<Student>> mapRollNumberVsStudent1 = students.stream()
			.collect(Collectors.groupingBy(keyMapper, Collectors.toSet()));
		System.out.println("grouping By roll numbers : " + mapRollNumberVsStudent1);

		Map<Integer, Long> mapRollNumberVsCount = students.stream()
			.collect(Collectors.groupingBy(keyMapper, Collectors.counting()));
		System.out.println("grouping By roll numbers : " + mapRollNumberVsCount);
		
		
		Map<Integer, Long> mapRollNumberVsCount1 = students.stream()
				.collect(Collectors.groupingBy(keyMapper,TreeMap::new, Collectors.counting()));
			System.out.println("grouping By roll numbers : " + mapRollNumberVsCount1);

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