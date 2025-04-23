package com.mm.java_lang_package.object_class;

public class TestApp {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student1 = new Student(1001, "Mangesh", new Course(101, "IT"));
		Student student2 = new Student(1001, "Mangesh", new Course(101, "IT"));
		Student student3 = new Student(1003, "Prasad", new Course(102, "Mech"));
		Student student4 = student1;
		Student student5 = student1.clone();

		System.out.println(student1.toString());

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

		System.out.println(student1.equals(student2));
		System.out.println(student1.equals(student3));
		System.out.println(student1.equals(student4));
		System.out.println(student1.equals(null));
		System.out.println(student1.equals("mangesh"));

		System.out.println(student5);
		System.out.println(student1 == student5);// false
		System.out.println(student1.equals(student5));// true

		student1.course.courseName = "Civil";
		System.out.println(student1);
		System.out.println(student5);
		
		
		System.out.println(student1.getClass());

	}

}
