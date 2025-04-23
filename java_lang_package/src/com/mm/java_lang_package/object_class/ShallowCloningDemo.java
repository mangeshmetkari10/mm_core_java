package com.mm.java_lang_package.object_class;

public class ShallowCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student student1 = new Student(1001, "Mangesh", new Course(101, "IT"));
		Student student2 = student1.clone();
		Student student3 = student1;

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student1 == student2);// false
		System.out.println(student1.equals(student2));// true

		student1.course.courseName = "Civil";
		System.out.println(student1);
		System.out.println(student2);
		

	}

}
