package com.mm.java8.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "world");

		// Using map to get the length of each word
		List<Integer> wordLengths = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("Word lengths (map): " + wordLengths); // Output: [5, 5]

		// Using flatMap to get individual characters from words
		List<String> characters = words.stream()
			.flatMap(word -> Stream.of(word.split("")))
			.collect(Collectors.toList());
		System.out.println("Characters (flatMap): " + characters); // Output: [h, e, l, l, o, w, o, r, l, d]

		List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));

		// Using map will not flatten the structure
		List<List<Integer>> mappedNumbers = numbers.stream().map(x -> x).collect(Collectors.toList());
		System.out.println("Mapped Numbers (map): " + mappedNumbers); // Output: [[1, 2], [3, 4], [5, 6]]

		// Using flatMap to flatten the list of lists
		List<Integer> flattenedNumbers = numbers.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println("Flattened numbers (flatMap): " + flattenedNumbers); // Output: [1, 2, 3, 4, 5, 6]
	}
}