package com.mm.java8.stream.collectors.partitioningBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByCollectMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Mayur", "Shubham");
		System.out.println("Original Names list : " + names);
		// Original Names list : [Mangesh, Rohan, Akash, Mayur, Shubham]
		Predicate<String> predicate = new Predicate<String>() {

			@Override
			public boolean test(String name) {
				return name.startsWith("M");
			}
		};

		Map<Boolean, List<String>> mapNamesStartsWithMVsAll = names.stream()
			.collect(Collectors.partitioningBy(predicate));
		System.out.println("Names starts with M vs all : " + mapNamesStartsWithMVsAll);
		// Names starts with M vs all : {false=[Rohan, Shubham], true=[Mangesh,
		// Mayur]}

		Map<Boolean, List<String>> nameslengthGreater5andLess5 = names.stream()
			.collect(Collectors.partitioningBy((name) -> name.length() > 5));
		System.out.println("Map of name length > 5 : " + nameslengthGreater5andLess5);
		// Map of name length > 5 : {false=[Rohan, Mayur], true=[Mangesh,
		// Shubham]}
	}

}
