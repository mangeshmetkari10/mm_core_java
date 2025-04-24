package com.mm.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionQuantifiersClassesDemo {

	public static void main(String[] args) {

		int count = 0;
		findByPattern(count, "a");
		findByPattern(count, "a?");
		findByPattern(count, "a+");
		findByPattern(count, "a*");
		findByPattern(count, "a{2}");
		findByPattern(count, "a{2,}");
		findByPattern(count, "a{1,3}");
	}

	private static void findByPattern(int count, String x) {
		Pattern pattern = Pattern.compile(x);
		Matcher matcher = pattern.matcher("abaabaaab");
		System.out.println("pattern : " + x);
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start() + "----" + matcher.end() + "----" + matcher.group());
		}

		System.out.println("The number of occurences : " + count);
	}

}
