package com.mm.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {

		int count = 0;
		Pattern pattern = Pattern.compile("ab");
		Matcher matcher = pattern.matcher("abbababa");
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start() + "----" + matcher.end() + "----" + matcher.group());
		}

		System.out.println("The number of occurences : " + count);
	}

}
