package com.mm.java8.stream.min;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMethodDemo2 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12, 43, 54, 342, 54, 34, 4);
		System.out.println("Original Number list : " + numbers);

		Comparator<Integer> intComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1.compareTo(o2);
			}
		};
		Integer min = numbers.stream().min(intComparator).get();
		System.out.println("Min number in List  : " + min);
	}
}
