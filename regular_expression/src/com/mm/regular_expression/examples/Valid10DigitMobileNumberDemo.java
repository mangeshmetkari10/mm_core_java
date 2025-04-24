package com.mm.regular_expression.examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid10DigitMobileNumberDemo {

	public static void main(String[] args) {

		// should contain 10 digit
		// should starts with 9 orn8 or 7

		validateMobileNumber("9665624964", "[7-9][0-9]{9}");
		validateMobileNumber("9665624964", "[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
	}

	private static void validateMobileNumber(String mobileNumber, String splitPattern) {
		Pattern pattern = Pattern.compile(splitPattern);
		Matcher matcher = pattern.matcher(mobileNumber);
		String mobNumber = null;
		while (matcher.find()) {

			mobNumber = matcher.group();
		}
		if (mobNumber != null) {
			System.out.println(" Number is Valid : " + Long.valueOf(mobNumber));
		} else
			System.out.println(" Sorry !! Number is Invalid");
	}
}
