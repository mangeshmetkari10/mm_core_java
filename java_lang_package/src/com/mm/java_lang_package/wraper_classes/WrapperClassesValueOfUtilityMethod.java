package com.mm.java_lang_package.wraper_classes;

public class WrapperClassesValueOfUtilityMethod {

	public static void main(String[] args) throws CloneNotSupportedException {

		Integer integer1 = Integer.valueOf(10);
		Integer integer2 = Integer.valueOf("10");

		System.out.println(integer1);// 10
		System.out.println(integer2);// 10

		Long long1 = Long.valueOf(10);
		Long long2 = Long.valueOf("10");

		System.out.println(long1);// 10
		System.out.println(long2);// 10

		Double double1 = Double.valueOf(10.5);
		Double double2 = Double.valueOf("20.2");

		System.out.println(double1);// 10.5
		System.out.println(double2);// 20.2

		Float float1 = Float.valueOf(11.3f);
		Float float2 = Float.valueOf("32.43");

		System.out.println(float1);// 11.3
		System.out.println(float2);// 11.5

		Character character1 = Character.valueOf('M');
		System.out.println(character1);

		Boolean boolean1 = Boolean.valueOf(true);
		Boolean boolean2 = Boolean.valueOf("TrUe");
		Boolean boolean3 = Boolean.valueOf("d");

		System.out.println(boolean1);// true
		System.out.println(boolean2);// true
		System.out.println(boolean3);// false

	}
}
