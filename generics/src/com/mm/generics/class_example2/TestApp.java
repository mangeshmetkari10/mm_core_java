package com.mm.generics.class_example2;

public class TestApp {
	public static void main(String[] args) {

		Pair<String, Integer> pairOne = new Pair<String, Integer>("Mangesh", 1001);
		pairOne.displayContent();// Pair [key=Mangesh, value=1001]

		Student student = new Student(1001, "Snagram");
		Pair<Integer, Student> studentPair = new Pair<Integer, Student>(student.getRollNumber(), student);
		studentPair.displayContent();//Pair [key=1001, value=Student [rollNumber=1001, name=Snagram]]

	}
}
