package com.mm.regular_expression.string_tokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		StringTokenizer tokenizer = new StringTokenizer(
				"I am responsible for what I say, but I am not responsible for what you understand");

		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
		
		StringTokenizer tokenizer1 = new StringTokenizer(
				"9-6-6-5-6-2-4-9-6-4","-");

		while (tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}
	}

}
