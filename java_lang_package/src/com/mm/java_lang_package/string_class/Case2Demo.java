package com.mm.java_lang_package.string_class;

public class Case2Demo {

	public static void main(String[] args) {

		//In String class equals method is overridden for content comparison
		String s1 = new String("mangesh");
		String s2 = new String("mangesh");

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true

		//In StringBuffer class equals method is not overridden 
		//so it execute object class equals method which is meant for reference comparison
		StringBuffer sb1 = new StringBuffer("mangesh");
		StringBuffer sb2 = new StringBuffer("mangesh");

		System.out.println(sb1 == sb2);// false
		System.out.println(sb1.equals(sb2));// false

	}

}
