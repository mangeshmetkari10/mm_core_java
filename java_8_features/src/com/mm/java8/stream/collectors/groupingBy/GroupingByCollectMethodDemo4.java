package com.mm.java8.stream.collectors.groupingBy;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollectMethodDemo4 {

	public static void main(String[] args) {

		List<Person> persons = List.of(new Person(1, "Alex", 100d, new Department(1, "HR")),
				new Person(2, "Brian", 200d, new Department(1, "HR")),
				new Person(3, "Charles", 900d, new Department(2, "Finance")),
				new Person(4, "David", 200d, new Department(2, "Finance")),
				new Person(5, "Edward", 200d, new Department(2, "Finance")),
				new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
				new Person(7, "George", 900d, new Department(3, "ADMIN")));

		Function<Person, Department> classifier = new Function<Person, Department>() {

			@Override
			public Department apply(Person t) {
				return t.getDepartment();
			}
		};

		// or
		// Function<Person, Department> classifier = (Person t)-> t.getDepartment();
		// or
		// Function<Person, Department> classifier = Person::getDepartment;

		// grouping all the persons by department
		Map<Department, List<Person>> mapDeptVsPerson = persons.stream().collect(Collectors.groupingBy(classifier));

		System.out.println("Dept Vs Person :" + mapDeptVsPerson);

		// grouping all the person Ids by department
		Map<Department, List<Integer>> mapDeptVsPersonIds = persons.stream()
			.collect(Collectors.groupingBy(Person::getDepartment,
					Collectors.mapping(Person::getId, Collectors.toList())));

		System.out.println("Dept Vs Person Ids : " + mapDeptVsPersonIds);

		// grouping all the person Ids by department Id
		Map<Integer, List<Integer>> mapDeptIdVsPersonIds = persons.stream()
			.collect(Collectors.groupingBy(person -> person.getDepartment().getId(),
					Collectors.mapping(Person::getId, Collectors.toList())));

		System.out.println("Dept Id Vs Person Ids : " + mapDeptIdVsPersonIds);

		// grouping all the person count by department
		Map<Department, Long> mapDeptIdVsNumberOfPerson = persons.stream()
			.collect(Collectors.groupingBy(person -> person.getDepartment(), Collectors.counting()));

		System.out.println("Dept Id Vs Number of Person : " + mapDeptIdVsNumberOfPerson);

		// group on distinct departments and salary pairs.
		Map<Object, List<Integer>> map = persons.stream()
			.collect(Collectors.groupingBy(person -> new Pair(person.getSalary(), person.getDepartment()),
					Collectors.mapping(Person::getId, Collectors.toList())));

		System.out.println(map);

	}
}

class Person {
	int id;
	String name;
	double salary;
	Department department;

	Person(int id, String name, double salary, Department department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	@Override
	public int hashCode() {

		return (int) (31 + id + name.hashCode() + salary + department.hashCode());
	}

	@Override
	public boolean equals(Object obj) {

		Person person = (Person) obj;
		if (this.id == person.id && this.name.equals(person.name) && this.salary == person.salary
				&& this.department.equals(person.department))
			return true;
		return false;
	}

}

class Department {
	int id;
	String name;

	Department(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {

		return 31 + id + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		Department department = (Department) obj;
		if (this.id == department.id && this.name.equals(department.name))
			return true;
		return false;
	}

}

class Pair {

	Double salary;
	Department department;

	public Pair(Double salary, Department department) {
		this.salary = salary;
		this.department = department;
	}

	@Override
	public int hashCode() {
		return (int) (31 + salary + department.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		Pair pair = (Pair) obj;
		if (this.salary == pair.salary && this.department.equals(pair.department))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Pair [salary=" + salary + ", department=" + department + "]";
	}

}