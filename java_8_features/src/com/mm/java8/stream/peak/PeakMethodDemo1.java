package com.mm.java8.stream.peak;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PeakMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Shubham]
		Function<String, String> function = new Function<String, String>() {

			@Override
			public String apply(String name) {
				return name.toUpperCase();
			}
		};
		List<String> nameInUpperCase = names.stream()
			.peek(name -> System.out.println("Before maping : " + name))
			.map(function)
			.peek(name -> System.out.println("After maping : " + name))
			.collect(Collectors.toList());
		System.out.println("List of In Upper Case: " + nameInUpperCase);
		//Before maping : Mangesh   //After maping : MANGESH
		//Before maping : Shubham
		//After maping : SHUBHAM
		//List of In Upper Case: [MANGESH, SHUBHAM]
	}
}