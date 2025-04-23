package com.mm.java_lang_package.string_class;

public class Case1Demo {

	public static void main(String[] args) {

		// If we try to perform any changes in String object
		// It will generate new String object with those changes
		String s = new String("mangesh");
		s.concat("software");
		System.out.println(s);// mangesh

		// If we try to perform any changes in String object
		// It will do changes in existing String object
		StringBuffer sb = new StringBuffer("mangesh");
		sb.append("software");
		System.out.println(sb);// mangeshsoftware

	}

}
