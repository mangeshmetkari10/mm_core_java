package com.mm.java8.stream.collectors.summarizingDouble;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingDoubleCollectMethodDemo {

	public static void main(String[] args) {

		List<Double> numbers = Arrays.asList(1.1, 3.3, 4.4, 7.7, 8.8, 9.9);
		System.out.println("list : " + numbers);
		// list : [1.1, 3.3, 4.4, 7.7, 8.8, 9.9]
		DoubleSummaryStatistics summaryStatistics = numbers.stream()
			.collect(Collectors.summarizingDouble(Double::doubleValue));
		System.out.println("Summary : " + summaryStatistics);
		// Summary : DoubleSummaryStatistics{count=6, sum=35.200000, min=1.100000,
		// average=5.866667, max=9.900000}
	}
}
