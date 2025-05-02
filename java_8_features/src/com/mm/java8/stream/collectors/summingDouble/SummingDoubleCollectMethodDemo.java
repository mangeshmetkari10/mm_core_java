package com.mm.java8.stream.collectors.summingDouble;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingDoubleCollectMethodDemo {

	public static void main(String[] args) {

		List<Double> numbers = Arrays.asList(1.1, 3.3, 5.5, 6.6, 8.8);
		System.out.println("list : " + numbers);//list : [1.1, 3.3, 5.5, 6.6, 8.8]

		Double sum = numbers.stream().collect(Collectors.summingDouble(Double::doubleValue));
		System.out.println("sum : " + sum);//sum : 25.3
	}
}
