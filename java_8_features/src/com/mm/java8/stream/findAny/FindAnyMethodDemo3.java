package com.mm.java8.stream.findAny;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindAnyMethodDemo3 {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Mangesh"), new Student(102, "Shubham"),
				new Student(104, "Raj"), new Student(103, "Mayur"));
		System.out.println("Original Students list : " + students);

		Predicate<Student> predicate = new Predicate<Student>() {

			@Override
			public boolean test(Student t) {

				return t.name.length() == 5;
			}

		};

		Student studentNamewithLenght5 = students.stream().filter(predicate).findAny().get();
		System.out.println("Find Any Student whose Name with lenght 5: " + studentNamewithLenght5);

		// using lambda expression
		Student studentsIdGreaterThan102 = students.stream().filter((student) -> student.rollNumber > 102).findAny()
				.get();
		System.out.println("Find Any Studens whose roll number  is > 102 : " + studentsIdGreaterThan102);
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