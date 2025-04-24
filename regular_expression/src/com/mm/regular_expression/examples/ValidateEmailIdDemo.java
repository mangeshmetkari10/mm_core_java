package com.mm.regular_expression.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailIdDemo {

	public static void main(String[] args) {
		
		//should contain 10 digit
		//should starts with 9 orn8 or 7

		validateMobileNumber("mangesh.metkari10_@gmail.com", "[a-zA-Z0-9._]*@[a-zA-Z]+([.][a-zA-Z]+)*");
		
	}

	private static void validateMobileNumber(String mobileNumber, String splitPattern) {
		Pattern pattern = Pattern.compile(splitPattern);
		Matcher matcher = pattern.matcher(mobileNumber);
		String emailId = null;
		while (matcher.find()) {

			emailId = matcher.group();
		}
		if (emailId != null) {
			System.out.println(" emailId is Valid : " + emailId);
		} else
			System.out.println(" Sorry !! emailId is Invalid");
	}
}
