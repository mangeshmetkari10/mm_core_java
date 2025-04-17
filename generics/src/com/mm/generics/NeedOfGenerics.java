package com.mm.generics;

import java.util.ArrayList;
import java.util.List;

public class NeedOfGenerics {

	public static void main(String[] args) {

		problem();
		solution();
	}

	private static void problem() {
		List list = new ArrayList();
		list.add("abc");
		list.add(new Integer(5)); // OK
		for (Object obj : list) {
			// type casting leading to ClassCastException at runtime
			String str = (String) obj;
			System.out.println(str);
		}
	}

	private static void solution() {
		List<String> list1 = new ArrayList<String>();
		list1.add("abc");
		// list1.add(new Integer(5)); //compiler error :the method add(String) in the
		// type List<String> is not applicable for the arguments (Integer)
		for (String str1 : list1) {
			// no type casting needed, avoids ClassCastException
			System.out.println(str1);
		}
	}

}
