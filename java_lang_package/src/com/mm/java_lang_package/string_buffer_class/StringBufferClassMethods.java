package com.mm.java_lang_package.string_buffer_class;

public class StringBufferClassMethods {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer(" mangesh ");
		StringBuffer str2 = new StringBuffer(" metkari ");

		System.out.println(str1.charAt(2));// n

		str1.append(str2);
		System.out.println(str1);// mangesh metkari

		System.out.println(str1.equals("mangesh"));// false

		System.out.println(str1.substring(7));// h metkari

		System.out.println(str1.length());// 18
		
		System.out.println(str1.delete(9, 18));// mangesh 
		

	}

}
