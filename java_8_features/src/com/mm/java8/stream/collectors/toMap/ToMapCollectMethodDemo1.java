package com.mm.java8.stream.collectors.toMap;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Raj, Mayur]
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
		Map<String, Integer> mapStringVsLength = names.stream()
			.map(name -> name.toUpperCase())
			.collect(Collectors.toMap(keyMapper, valueMapper));
		System.out.println("Map of String Vs length: " + mapStringVsLength);
		//Map of String Vs length: {MAYUR=5, MANGESH=7, RAJ=3}
		Map<Integer, String> mapLengthVsString = names.stream()
			.map((name) -> name.toLowerCase())
			.collect(Collectors.toMap(str -> str.length(), str -> str));
		System.out.println("Map of String length Vs String: " + mapLengthVsString);
		//Map of String length Vs String: {3=raj, 5=mayur, 7=mangesh}
		Map<String, String> mapStringVsUpper = names.stream()
			.map((name) -> name.toLowerCase())
			.collect(Collectors.toMap(Function.identity(), str -> str.toUpperCase()));
		System.out.println("Map of string Vs String Upper : " + mapStringVsUpper);
		//Map of string Vs String Upper : {mangesh=MANGESH, raj=RAJ, mayur=MAYUR}
	}
}
