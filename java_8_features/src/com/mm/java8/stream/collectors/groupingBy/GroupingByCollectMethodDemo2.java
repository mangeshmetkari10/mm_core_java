package com.mm.java8.stream.collectors.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollectMethodDemo2 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 5, 3, 2, 1, 5);
		System.out.println("Original Number list : " + numbers);
		//Original Number list : [1, 5, 3, 2, 1, 5]
		Function<Integer, Integer> valueMapper = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t;
			}
		};
		Map<Integer, List<Integer>> mapNumberVsSquares = numbers.stream().collect(Collectors.groupingBy(valueMapper));
		System.out.println("grouping numbers  : " + mapNumberVsSquares);
		//grouping numbers  : {1=[1, 1], 2=[2], 3=[3], 5=[5, 5]}
		Map<Integer, Set<Integer>> groupingByNumberVsSquares = numbers.stream()
			.collect(Collectors.groupingBy(valueMapper, Collectors.toSet()));
		System.out.println("grouping numbers  : " + groupingByNumberVsSquares);
		//grouping numbers  : {1=[1], 2=[2], 3=[3], 5=[5]}
		Map<Integer, Long> groupingByNumberVsCount = numbers.stream()
			.collect(Collectors.groupingBy(valueMapper, Collectors.counting()));
		System.out.println("grouping numbers  : " + groupingByNumberVsCount);
		//grouping numbers  : {1=2, 2=1, 3=1, 5=2}
		Map<Integer, Long> groupingByNumberVsCount1 = numbers.stream()
			.collect(Collectors.groupingBy(valueMapper, TreeMap::new, Collectors.counting()));
		System.out.println("grouping numbers  : " + groupingByNumberVsCount1);
		//grouping numbers  : {1=2, 2=1, 3=1, 5=2}

	}
}
