package com.mm.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionCharacterClassesDemo {

	public static void main(String[] args) {

		int count = 0;
		findByPattern(count, "[abc]");
		findByPattern(count, "[^abc]");
		findByPattern(count, "[a-z]");
		findByPattern(count, "[A-Z]");
		findByPattern(count, "[a-zA-Z]");
		findByPattern(count, "[0-9]");
		findByPattern(count, "[a-zA-Z0-9]");
		findByPattern(count, "[^a-zA-Z0-9]");
	}

	private static void findByPattern(int count, String x) {
		Pattern pattern = Pattern.compile(x);
		Matcher matcher = pattern.matcher("a7b$P@z9#K");
		System.out.println("pattern : " + x);
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start() + "----" + matcher.end() + "----" + matcher.group());
		}

		System.out.println("The number of occurences : " + count);
	}

}
