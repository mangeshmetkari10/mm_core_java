package com.mm.java8.stream.collectors.summingInt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntCollectMethodDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 4, 5, 6, 8, 9);
		System.out.println("list : " + numbers);//list : [1, 4, 5, 6, 8, 9]

		Integer sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("sum : " + sum);//sum : 33
	}
}
