package com.mm.java_lang_package.object_class;

public class Student implements Cloneable {

	int rollNumber;
	String name;
	Course course;

	public Student(int rollNumber, String name, Course course) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return rollNumber + name.hashCode() + course.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		try {
			int rollNumber1 = this.rollNumber;
			String name1 = this.name;
			Course course1 = this.course;
			Student student = (Student) obj;
			Course course2 = this.course;
			String name2 = student.name;
			int rollNumber2 = student.rollNumber;
			if ((name1.equals(name2) && rollNumber1 == rollNumber2)
					&& (course1.courseName.equals(course2.courseName) && course1.courseId == course2.courseId))
				return true;
			else
				return false;
		} catch (ClassCastException e) {
			return false;
		} catch (NullPointerException e) {
			return false;
		}
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {
		
		//shallow cloning 
		//return (Student) super.clone();
		
		//Deep cloning 
		Course course = new Course(this.course.courseId, this.course.courseName);
		Student  student = new Student(this.rollNumber, this.name, course);
		
		return student;
	}

}