package com.mm.java_lang_package.wraper_classes;

public class WrapperClassesConstructors {

	@SuppressWarnings("removal")
	public static void main(String[] args) throws CloneNotSupportedException {

		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer("10");

		// Integer integer3 = new Integer("ten"); //NumberFormatException
		System.out.println(integer1);// 10
		System.out.println(integer2);// 10

		Double double1 = new Double(10.5);
		Double double2 = new Double("20.2");

		System.out.println(double1);// 10.5
		System.out.println(double2);// 20.2

		Float float1 = new Float(11.3);
		Float float2 = new Float(11.5f);
		Float float3 = new Float("32.43");

		System.out.println(float1);// 11.3
		System.out.println(float2);// 11.5
		System.out.println(float3);// 32.43

		Character character1 = new Character('M');
		// Character character2 = new Character("N");//he constructor Character(String)
		// is undefined

		System.out.println(character1);

		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean("TrUe");
		Boolean boolean3 = new Boolean("d");

		System.out.println(boolean1);// true
		System.out.println(boolean2);// true
		System.out.println(boolean3);// false

	}

}
