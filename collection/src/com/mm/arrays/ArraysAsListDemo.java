package com.mm.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		String[] s = { "S", "N", "D", "M" };
		List list = Arrays.asList(s);
		System.out.println(list);// [S, N, D, M]
		list.set(2, "F");
		System.out.println(list);// [S, N, F, M]
		for (String s1 : s) {
			System.out.println(s1);
		}

		// list.add("G");//java.lang.UnsupportedOperationException
		// list.remove(1);//java.lang.UnsupportedOperationException
		//list.set(1, new Integer(12));//java.lang.ArrayStoreException
	}

}
