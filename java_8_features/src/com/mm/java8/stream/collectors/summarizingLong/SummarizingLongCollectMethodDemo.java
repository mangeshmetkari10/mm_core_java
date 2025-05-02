package com.mm.java8.stream.collectors.summarizingLong;

import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class SummarizingLongCollectMethodDemo {

	public static void main(String[] args) {

		List<Long> numbers = Arrays.asList(100l, 400l, 500l, 600l, 900l);
		System.out.println("list : " + numbers);//list : [100, 400, 500, 600, 900]

		LongSummaryStatistics summaryStatistics = numbers.stream().collect(Collectors.summarizingLong(Long::longValue));
		System.out.println("summary : " + summaryStatistics);
		//summary : LongSummaryStatistics{count=5, sum=2500, min=100, average=500.000000, max=900}
	}
}
