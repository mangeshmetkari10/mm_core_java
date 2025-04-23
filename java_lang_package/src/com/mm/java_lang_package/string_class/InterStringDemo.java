package com.mm.java_lang_package.string_class;

public class InterStringDemo {

	public static void main(String[] args) {

		String str1 = new String("mangesh");
		String str2 = str1.concat("metkari");
		String str3 = str2.intern();
		String str4 = "mangeshmetkari";

		System.out.println(str3 == str4);// true

	}

}
