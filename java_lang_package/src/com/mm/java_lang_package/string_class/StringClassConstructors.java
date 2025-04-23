package com.mm.java_lang_package.string_class;

public class StringClassConstructors {
	public static void main(String[] args) {
		String str1 = new String();
		System.out.println(str1);
		String str2 = new String("mangesh");
		System.out.println(str2);
		StringBuffer buffer = new StringBuffer("raja");
		String str3 = new String(buffer);
		System.out.println(str3);
		char[] charArray = { 's', 'o', 'f', 't' };

		String str4 = new String(charArray);
		System.out.println(str4);

	}

}
