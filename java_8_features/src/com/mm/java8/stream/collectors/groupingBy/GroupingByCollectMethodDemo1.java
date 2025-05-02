package com.mm.java8.stream.collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Shubham", "Raj", "Mayur");
		System.out.println("Original names list : " + names);
		//Original names list : [Mangesh, Shubham, Raj, Mayur]
		Function<String, Integer> classifier = new Function<String, Integer>() {

			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		Map<Integer, List<String>> groupingByNameLength = names.stream().collect(Collectors.groupingBy(classifier));
		System.out.println("groupingBy length: " + groupingByNameLength);
		//groupingBy length: {3=[Raj], 5=[Mayur], 7=[Mangesh, Shubham]}
		Map<Integer, Set<String>> groupingByNameLength1 = names.stream()
			.collect(Collectors.groupingBy(classifier, Collectors.toSet()));
		System.out.println("groupingBy length: " + groupingByNameLength1);

		Map<Integer, Long> groupingByNameLengthVsCount = names.stream()
			.collect(Collectors.groupingBy(classifier, Collectors.counting()));
		System.out.println("Map of String and length: " + groupingByNameLengthVsCount);
		//Map of String and length: {3=1, 5=1, 7=2}
		
		Map<Integer, Long> groupingByNameLengthVsCount1 = names.stream()
			.collect(Collectors.groupingBy(classifier, TreeMap::new, Collectors.counting()));
		System.out.println("Map of String and length: " + groupingByNameLengthVsCount1);
		//Map of String and length: {3=1, 5=1, 7=2}
	}
}