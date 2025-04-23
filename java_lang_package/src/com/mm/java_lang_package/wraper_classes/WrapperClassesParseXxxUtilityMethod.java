package com.mm.java_lang_package.wraper_classes;

public class WrapperClassesParseXxxUtilityMethod {

	public static void main(String[] args) throws CloneNotSupportedException {

		Integer integer1 = Integer.parseInt("10");
		Long long1 = Long.parseLong("1233");
		Double double1 = Double.parseDouble("10.5");
		Float float1 = Float.parseFloat("11.3f");

		System.out.println(integer1);// 10
		System.out.println(long1);// 1233
		System.out.println(double1);// 10.5
		System.out.println(float1);// 11.3
	}
}
