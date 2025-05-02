package com.mm.java8.stream.mapToLong;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToLongFunction;

public class MapToLongMethodDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("3", "6", "8", "14", "15");
		System.out.println("Original number list : " + list);
		// Original number list : [3, 6, 8, 14, 15]
		ToLongFunction<String> toLongFun = new ToLongFunction<String>() {

			@Override
			public long applyAsLong(String value) {
				return Long.parseLong(value);
			}
		};

		System.out.println("sum:" + list.stream().mapToLong(toLongFun).sum());// sum:46
		System.out.println("avg:" + list.stream().mapToLong(toLongFun).average().getAsDouble());
		// avg:9.2
		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mayur]
		System.out.println("avg length:" + names.stream().mapToLong(str -> str.length()).average().getAsDouble());
		// avg length:5.5
	}
}
