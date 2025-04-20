package com.mm.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(122);
		list.add(3);
		list.add(14);
		list.add(2);
		list.add(32);

		System.out.println(list);// [122, 3, 14, 2, 32]
		Collections.reverse(list);
		System.out.println(list);// [32, 2, 14, 3, 122]

	}
}
