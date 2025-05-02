package com.mm.java8.stream.mapToDouble;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class MapToDoubleMethodDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("3", "6", "8", "14", "15");
		System.out.println("Original number list : " + list);
		// Original number list : [3, 6, 8, 14, 15]
		ToDoubleFunction<? super String> toDoubleFun = new ToDoubleFunction<String>() {

			@Override
			public double applyAsDouble(String value) {
				return Double.parseDouble(value);
			}
		};

		System.out.println("sum :" + list.stream().mapToDouble(toDoubleFun).sum());// sum :46.0
		System.out.println("avg :" + list.stream().mapToDouble(toDoubleFun).average().getAsDouble());
		// avg :9.2
		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		// Original names list : [Mangesh, Shubham, Raj, Mayur]
		System.out.println("avg length :" + names.stream().mapToDouble(str -> str.length()).average().getAsDouble());
		// avg length :5.5
	}
}
