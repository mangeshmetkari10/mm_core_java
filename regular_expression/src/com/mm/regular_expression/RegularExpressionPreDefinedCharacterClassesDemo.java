package com.mm.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionPreDefinedCharacterClassesDemo {

	public static void main(String[] args) {

		int count = 0;
		findByPattern(count, "\\s");
		findByPattern(count, "\\S");
		findByPattern(count, "\\d");
		findByPattern(count, "\\D");
		findByPattern(count, "\\w");
		findByPattern(count, "\\W");
		findByPattern(count, ".");
	}

	private static void findByPattern(int count, String x) {
		Pattern pattern = Pattern.compile(x);
		Matcher matcher = pattern.matcher("a7b$ P@z9#K");
		System.out.println("pattern : " + x);
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start() + "----" + matcher.end() + "----" + matcher.group());
		}

		System.out.println("The number of occurences : " + count);
	}

}
