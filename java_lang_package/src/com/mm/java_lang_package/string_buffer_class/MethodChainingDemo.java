package com.mm.java_lang_package.string_buffer_class;

public class MethodChainingDemo {

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer();
		buffer.append("Mangesh").append("software").append("solutions").insert(2, "MNM").delete(5, 9).reverse()
				.append("Sangli");

		System.out.println(buffer);

		String string = new String();
		String newString = string.concat("Mangesh").concat("software").concat("solutions").concat("MNM").concat("Sangli");

		System.out.println(newString);

	}

}
