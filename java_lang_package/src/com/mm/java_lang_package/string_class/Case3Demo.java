package com.mm.java_lang_package.string_class;

public class Case3Demo {

	public static void main(String[] args) {

		// If we are creating String object using new keyword then
		// two objects will be created one in heap and one in SCP
		// It is pointing to heap object
		String str1 = new String("mangesh");
		String str2 = new String("mnagesh");
		String str3 = "mnagesh";
		String str4 = "mnagesh";

		System.out.println(str1 == str2);// false
		System.out.println(str2 == str3);// false
		System.out.println(str3 == str4);// true (both pointing to heap area object)

		String s1 = new String("you cannot change me!");
		String s2 = new String("you cannot change me!");
		System.out.println(s1 == s2);// false
		String s3 = "you cannot change me!";
		System.out.println(s1 == s3);// false
		String s4 = "you cannot change me!";
		System.out.println(s3 == s4);// true
		String s5 = "you cannot " + "change me!";
		System.out.println(s3 == s5);// true
		String s6 = "you cannot ";
		String s7 = s6 + "change me!";
		System.out.println(s3 == s7);// false
		final String s8 = "you cannot ";
		String s9 = s8 + "change me!";
		System.out.println(s3 == s9);// true
		System.out.println(s6 == s8);// true

	}

}
