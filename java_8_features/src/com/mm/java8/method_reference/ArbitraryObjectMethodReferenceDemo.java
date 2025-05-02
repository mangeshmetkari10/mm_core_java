package com.mm.java8.method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArbitraryObjectMethodReferenceDemo {
	public static void main(String[] args) {

		List<String> words = Arrays.asList("hello", "world", "java", "programming");

		// Using a lambda expression
		List<String> upperCaseLambda = words.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
		// Using an arbitrary object method reference
		List<String> upperCaseMethodRef = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("lambda : " + upperCaseLambda);
		// lambda : [HELLO, WORLD, JAVA, PROGRAMMING]
		System.out.println("method reference: " + upperCaseMethodRef);
		// method reference: [HELLO, WORLD, JAVA, PROGRAMMING]

		// Using an arbitrary object method reference with a custom class
		List<Person> people = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30));

		List<String> names = people.stream().map(Person::getName).collect(Collectors.toList());
		System.out.println("Names: " + names);
		// Names: [Alice, Bob]
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
