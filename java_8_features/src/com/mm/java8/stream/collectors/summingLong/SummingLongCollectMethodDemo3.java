package com.mm.java8.stream.collectors.summingLong;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingLongCollectMethodDemo3 {

	public static void main(String[] args) {

		List<Long> numbers = Arrays.asList(300l, 500l, 600l, 800l, 900l);
		System.out.println("list : " + numbers);//list : [300, 500, 600, 800, 900]

		Long sum = numbers.stream().collect(Collectors.summingLong(Long::longValue));
		System.out.println("sum : " + sum);//sum : 3100
	}
}
