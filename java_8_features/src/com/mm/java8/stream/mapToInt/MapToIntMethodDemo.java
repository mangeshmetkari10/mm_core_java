package com.mm.java8.stream.mapToInt;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToIntFunction;

public class MapToIntMethodDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("3", "6", "8", "14", "15");
		System.out.println("Original number list : " + list);
		// Original number list : [3, 6, 8, 14, 15]
		ToIntFunction<String> toIntFunction1 = new ToIntFunction<String>() {

			@Override
			public int applyAsInt(String value) {
				return Integer.parseInt(value);
			}
		};

		int sum = list.stream().mapToInt(toIntFunction1).sum();
		System.out.println("sum :" + sum);// sum :46
		OptionalDouble avg = list.stream().mapToInt(toIntFunction1).average();
		System.out.println("avg :" + avg.getAsDouble());// avg :9.2

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mayur]
		OptionalDouble avgLength = names.stream().mapToInt(str -> str.length()).average();
		System.out.println("Average length :" + avgLength.getAsDouble());// Average length :5.5
	}
}