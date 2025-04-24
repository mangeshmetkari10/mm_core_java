package com.mm.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionPatternSplitsMethodDemo {

	public static void main(String[] args) {

		int count = 0;
		
		splitingString(count, "\\s");
		splitingString(count, ".");
		splitingString(count, "\\s");
	}

	private static void splitingString(int count, String splitPattern) {
		Pattern pattern = Pattern.compile(splitPattern);
		Matcher matcher = pattern.matcher("mangesh nivrutti metkari");
		while (matcher.find()) {
			count++;
			System.out.println(matcher.start() + "----" + matcher.end() + "----" + matcher.group());
		}

		System.out.println("The number of occurences : " + count);
	}

}
