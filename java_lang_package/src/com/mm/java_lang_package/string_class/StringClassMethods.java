package com.mm.java_lang_package.string_class;

public class StringClassMethods {

	public static void main(String[] args) {

		String str1 = new String(" mangesh ");
		String str2 = new String(" metkari ");

		System.out.println(str1.charAt(2));// n

		String str3 = str1.concat(str2);
		System.out.println(str3);// mangesh metkari

		System.out.println(str1.equals("mangesh"));// true

		System.out.println(str1.equalsIgnoreCase("MANGESH"));// true

		System.out.println(str3.substring(7));// metkari

		System.out.println(str3.length());// 15

		System.out.println(str3.replace('m','M'));// Mangesh Metkari
		
		System.out.println(str3.toLowerCase());//  mangesh  metkari 

		System.out.println(str3.toUpperCase());//  MANGESH  METKARI 
		
		System.out.println(str3.trim());// mangesh  metkari
		
		System.out.println(str3.indexOf('m'));//1
		
		System.out.println(str3.lastIndexOf('m'));//10
		
		
		

	}

}
