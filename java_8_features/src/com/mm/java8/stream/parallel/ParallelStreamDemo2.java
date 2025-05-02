package com.mm.java8.stream.parallel;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("list : " + numbers);//list : [1, 2, 3, 4, 5]

		System.out.println("Sequential Stream :");//Sequential Stream :
		numbers.stream().map(n -> n * 2).forEach(System.out::println);//2
		//4
		//6
		//8
		//10

		System.out.println("Parallel Stream :");//Parallel Stream :
		numbers.parallelStream().map(n -> n * 2).forEach(System.out::println);//6
		//10
		//8
		//4
		//2
	}
}