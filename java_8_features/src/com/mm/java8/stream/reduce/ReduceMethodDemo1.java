package com.mm.java8.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethodDemo1 {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Mangesh", "Rohan", "Akash", "Mayur");
		System.out.println("Original Names list : " + names);
		//Original Names list : [Mangesh, Rohan, Akash, Mayur]
		BinaryOperator<String> accumulator = new BinaryOperator<String>() {

			@Override
			public String apply(String t, String u) {

				return t + u;
			}
		};
		String concatnicated1 = names.stream().reduce(accumulator).get();
		System.out.println("concatenate names : " + concatnicated1);
		//concatenate names : MangeshRohanAkashMayur
		String concatnicated2 = names.stream().reduce((s1, s2) -> s2 + s1).get();
		System.out.println("concatenate names reverse : " + concatnicated2);
		//concatenate names reverse : MayurAkashRohanMangesh
		String concatnicatedWithInitialValue1 = names.stream().reduce("@", accumulator);
		System.out.println("concatenate names with @ initial value  : " + concatnicatedWithInitialValue1);
		//concatenate names with @ initial value  : @MangeshRohanAkashMayur
		String concatnicatedWithInitialValue2 = names.stream().reduce("$", ((s1, s2) -> s1 + s2));
		System.out.println("concatenate names with $ initial value  : " + concatnicatedWithInitialValue2);
		//concatenate names with $ initial value  : $MangeshRohanAkashMayur
		String concatnicatedWithInitialValueAndCombiner1 = names.stream().reduce("#", accumulator, accumulator);
		System.out.println("concatenate names with # initial value  : " + concatnicatedWithInitialValueAndCombiner1);
		//concatenate names with # initial value  : #MangeshRohanAkashMayur
		String concatnicatedWithInitialValueAndCombiner2 = names.stream()
			.reduce("%", ((s1, s2) -> s1 + s2), ((s1, s2) -> s2 + s1));
		System.out.println("concatenate names with % initial value  : " + concatnicatedWithInitialValueAndCombiner2);
		//concatenate names with % initial value  : %MangeshRohanAkashMayur
	}
}