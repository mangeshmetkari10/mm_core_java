package com.mm.java8.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateFIVariantDemo {

	public static void main(String[] args) {

		IntPredicate intPredicate = (num) -> num % 2 == 0;
		System.out.println("IntPredicate : num " + 12 + " is even : " + intPredicate.test(12));
		// IntPredicate : num 12 is even : true
		LongPredicate longPredicate = (num) -> num % 2 != 0;
		System.out.println("LongPredicate: num " + 12 + " is odd  : " + longPredicate.test(12));
		// LongPredicate: num 12 is odd : false
		DoublePredicate doublePredicate = (num) -> num % 2 == 0;
		System.out.println("DoublePredicate : num " + 12.12 + " is even : " + doublePredicate.test(12.12));
		// DoublePredicate : num 12.12 is even : false
		BiPredicate<String, String> longString = (s1, s2) -> {
			if (s1.length() > s2.length())
				return true;
			return false;
		};
		if (longString.test("Mangesh", "Shubhra"))
			System.out.println("BiPredicate: Mangesh");
		else
			System.out.println("BiPredicate: Shubhra");
		// BiPredicate: Shubhra
	}
}
