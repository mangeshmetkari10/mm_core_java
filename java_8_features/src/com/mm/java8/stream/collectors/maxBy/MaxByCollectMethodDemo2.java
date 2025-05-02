package com.mm.java8.stream.collectors.maxBy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxByCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9);
		System.out.println("Original Number list : " + numbers);
		//Original Number list : [1, 2, 3, 4, 7, 8, 5, 6, 7, 8, 9]
		Integer maxNumber = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("Max Number  : " + maxNumber);//Max Number  : 9
	}
}
