package com.mm.java8.stream.collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapCollectMethodWithCollisionDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original list : " + names);
		// Original list : [Mangesh, Shubham, Raj, Mayur]
		Function<String, String> keyMapper = new Function<String, String>() {

			@Override
			public String apply(String t) {
				return t;
			}
		};
		Function<String, Integer> valueMapper = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		Map<String, Integer> mapStringVsLength = names.stream().collect(Collectors.toMap(keyMapper, valueMapper));
		System.out.println("Map of String and length: " + mapStringVsLength);

		Map<String, String> mapStringVsStringUpper = names.stream()
			.collect(Collectors.toMap(Function.identity(), str -> str.toUpperCase()));
		System.out.println("Map of string and String Upper : " + mapStringVsStringUpper);

		/*
		 * Map<Integer, String> mapLengthVsString = names.stream() .map((name) ->
		 * name.toLowerCase()) .collect(Collectors.toMap(str -> str.length(), str ->
		 * str)); System.out.println("Map of length and String: " + mapLengthVsString);
		 */

		Map<Integer, String> mapLengthVsString = names.stream()
			.collect(Collectors.toMap(str -> str.length(), str -> str, (key, identicalKey) -> identicalKey));
		System.out.println("Map of length and String: " + mapLengthVsString);
		// Map of length and String: {3=Raj, 5=Mayur, 7=Shubham}
		Map<Integer, String> mapLengthVsString1 = names.stream()
			.collect(Collectors.toMap(str -> str.length(), str -> str, (key, identicalKey) -> key));
		System.out.println("Map of length and String: " + mapLengthVsString1);
		// Map of length and String: {3=Raj, 5=Mayur, 7=Mangesh}
	}
}
