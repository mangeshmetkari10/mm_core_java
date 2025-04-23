package com.mm.java_lang_package.wraper_classes;

public class EqualsMethodVsEqualOperator {

	public static void main(String[] args) {

		String s1 = "Mangesh";
		String s2 = "Sangram";
		String s3 = "Mangesh";
		String s4 = new String("Mangesh");

		System.out.println(s1 == s3);// true
		System.out.println(s1.equals(s3));// true

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// false

		System.out.println(s1 == s4);// false
		System.out.println(s1.equals(s4));// true

	}

}
