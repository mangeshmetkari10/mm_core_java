package com.mm.java8.stream.forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan");
		System.out.println("Original Names list : " + names);
		// Original Names list : [Mangesh, Rohan]
		Consumer<? super String> upperCaseName = new Consumer<String>() {

			@Override
			public void accept(String name) {
				System.out.println(name.toUpperCase());

			}
		};
		System.out.println("Names in Upper Case :");
		names.stream().forEach(upperCaseName);//MANGESH
		//ROHAN
		System.out.println("Names in Lower Case :");
		names.stream().forEach(name -> System.out.println(name.toLowerCase()));

		System.out.println("Names and generated email ids :");

		Consumer<? super String> generateEmail = new Consumer<String>() {

			@Override
			public void accept(String t) {
				ForEachMethodDemo1.generateEmailId(t);

			}
		};
		names.stream().forEach(generateEmail);
		names.stream().forEach(name -> ForEachMethodDemo1.generateEmailId(name));
		//Mangesh : Mangesh@gmail.com
		//Rohan : Rohan@gmail.com
		
	}

	public static void generateEmailId(String name) {
		System.out.println(name + " : " + name + "@gmail.com");
	}
}
