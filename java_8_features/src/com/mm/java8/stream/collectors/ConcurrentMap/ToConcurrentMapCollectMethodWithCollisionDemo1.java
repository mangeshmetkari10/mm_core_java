package com.mm.java8.stream.collectors.ConcurrentMap;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToConcurrentMapCollectMethodWithCollisionDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("list : " + names);//list : [Mangesh, Shubham, Raj, Mayur]

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
		ConcurrentMap<String, Integer> mapStringVsLength = names.stream()
			.collect(Collectors.toConcurrentMap(keyMapper, valueMapper));
		System.out.println("ConcurrentMap of String and length: " + mapStringVsLength);
		//ConcurrentMap of String and length: {Mayur=5, Mangesh=7, Raj=3, Shubham=7}
		
		ConcurrentMap<String, String> mapStringVsStringUpper = names.stream()
			.collect(Collectors.toConcurrentMap(Function.identity(), str -> str.toUpperCase()));
		System.out.println("ConcurrentMap of string and String Upper : " + mapStringVsStringUpper);
		//ConcurrentMap of string and String Upper : {Mayur=MAYUR, Mangesh=MANGESH, Raj=RAJ, Shubham=SHUBHAM}

		/*
		 * ConcurrentMap<Integer, String> mapLengthVsString = names.stream() .map((name)
		 * -> name.toLowerCase()) .collect(Collectors.toConcurrentMap(str ->
		 * str.length(), str -> str));
		 * System.out.println("ConcurrentMap of length and String: " +
		 * mapLengthVsString);
		 */

		ConcurrentMap<Integer, String> mapLengthVsString = names.stream()
			.collect(Collectors.toConcurrentMap(str -> str.length(), str -> str, (key, identicalKey) -> identicalKey));
		System.out.println("ConcurrentMap of length and String: " + mapLengthVsString);
		//ConcurrentMap of length and String: {3=Raj, 5=Mayur, 7=Shubham}
		
		ConcurrentMap<Integer, String> mapLengthVsString1 = names.stream()
			.collect(Collectors.toConcurrentMap(str -> str.length(), str -> str, (key, identicalKey) -> key));
		System.out.println("ConcurrentMap of length and String: " + mapLengthVsString1);
		//ConcurrentMap of length and String: {3=Raj, 5=Mayur, 7=Mangesh}
	}
}