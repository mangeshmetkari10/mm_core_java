package com.mm.java8.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationDemo {

	public static void main(String[] args) {
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(3).forEach(System.out::println);// 97
		// 63
		// 11

		Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6 });
		System.out.println(stream.collect(Collectors.toList()));// [1, 2, 3, 4, 5, 6]

		Stream<String> stream2 = Stream.of("A$B$C".split("\\$"));
		System.out.println(stream2.collect(Collectors.toList()));// [A, B, C]

		List<String> list = Arrays.asList("M", "A", "P", "S");
		Stream<String> stream3 = list.stream();
		System.out.println(stream3.collect(Collectors.toSet()));// [P, A, S, M]
	}
}
