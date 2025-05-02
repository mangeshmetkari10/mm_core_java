package com.mm.java8.stream.collectors.summarizingInt;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingIntCollectMethodDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 9);
		System.out.println("list : " + numbers);// list : [1, 2, 4, 5, 6, 9]

		IntSummaryStatistics summaryStatistics = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("summary : " + summaryStatistics);// summary : IntSummaryStatistics{count=6, sum=27, min=1,
																// average=4.500000, max=9}
	}
}
