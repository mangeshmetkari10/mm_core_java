package com.mm.java8.functional_interface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.UnaryOperator;

public class FunctionFIVariantDemo {

	public static void main(String[] args) {

		IntFunction<Integer> intSquare = (a) -> (a * a);
		System.out.println("square of " + 12 + " is: " + intSquare.apply(12));
		// square of 12 is: 144
		DoubleFunction<Double> doubleSquare = (a) -> a * a;
		System.out.println("square of " + 12.12 + " is: " + doubleSquare.apply(12.12));
		// square of 12.12 is: 146.8944
		LongFunction<Long> longSquare = (a) -> a * a;
		System.out.println("square of " + 120000 + " is : " + longSquare.apply(120000));
		// square of 120000 is : 14400000000
		BiFunction<String, String, String> concatString = (str1, str2) -> str1 + str2;
		System.out.println(" string : " + concatString.apply("Welcome to ", "Java"));
		// string : Welcome to Java
		UnaryOperator<Integer> not = (a) -> a ^ 1;
		System.out.println("UnaryOperator : " + not.apply(0));// UnaryOperator : 1
		UnaryOperator<Double> squareRoot = (a) -> Math.sqrt(a);
		System.out.println("square root of 100.0 :" + squareRoot.apply(100.0));
		// square root of 100.0 :10.0
		UnaryOperator<StringBuffer> reverse = (a) -> a.reverse();
		System.out.println("UnaryOperator : " + reverse.apply(new StringBuffer("ABCDEFGHIJ")));
		// UnaryOperator : JIHGFEDCBA
		BinaryOperator<Integer> and = (a, b) -> a - b;
		System.out.println("BinaryOperator : " + and.apply(12, 14));// BinaryOperator : -2
	}
}