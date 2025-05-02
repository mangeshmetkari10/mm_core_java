package com.mm.java8.stream.collectors.ConcurrentMap;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToConcurrentMapCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham P", "Raj", "Mayur");
		System.out.println("list : " + names);//list : [Mangesh, Shubham P, Raj, Mayur]

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
			.map(name -> name.toUpperCase())
			.collect(Collectors.toConcurrentMap(keyMapper, valueMapper));
		System.out.println("ConcurrentMap String Vs length: " + mapStringVsLength);
		//ConcurrentMap String Vs length: {SHUBHAM P=9, MAYUR=5, MANGESH=7, RAJ=3}
		ConcurrentMap<Integer, String> mapLengthVsString = names.stream()
			.map((name) -> name.toLowerCase())
			.collect(Collectors.toConcurrentMap(str -> str.length(), str -> str));
		System.out.println("ConcurrentMap length vs String: " + mapLengthVsString);
		//ConcurrentMap length vs String: {3=raj, 5=mayur, 7=mangesh, 9=shubham p}
		ConcurrentMap<String, String> mapStringVsStringUpper = names.stream()
			.map((name) -> name.toLowerCase())
			.collect(Collectors.toConcurrentMap(Function.identity(), str -> str.toUpperCase()));
		System.out.println("ConcurrentMap of string vs Upper : " + mapStringVsStringUpper);
		//ConcurrentMap of string vs Upper : {shubham p=SHUBHAM P, mangesh=MANGESH, raj=RAJ, mayur=MAYUR}
	}
}