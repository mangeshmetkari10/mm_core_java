package com.mm.java_lang_package.string_buffer_class;

public class StringBufferClassConstructors {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer();
		System.out.println(str1);//16
		System.out.println(str1.capacity());
		StringBuffer str2 = new StringBuffer("mangesh");
		System.out.println(str2);
		System.out.println(str2.capacity());//23
		
		
		StringBuffer str3 = new StringBuffer();
		System.out.println(str3.capacity());//16
		str3=str2;
		System.out.println(str3);
		//capacity = 16+str2.length()
		System.out.println(str3.capacity());//23
		
		
		
	
		

	}

}
