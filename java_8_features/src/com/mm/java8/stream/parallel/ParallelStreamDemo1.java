package com.mm.java8.stream.parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Shubham, Raj, Mayur]
		System.out.println("Sequential Stream Output:");
		names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
		//MANGESH
		//SHUBHAM
		//RAJ
		//MAYUR
		System.out.println("Parallel Stream Output:");
		names.parallelStream().map(n -> n.toUpperCase()).forEach(System.out::println);
		//RAJ
		//MAYUR
		//MANGESH
		//SHUBHAM
	}
}
