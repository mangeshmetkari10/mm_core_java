package com.mm.collection.cursors;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Vector list = new Vector();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);

		ListIterator iterator = list.listIterator();
		while (iterator.hasNext()) {

			System.out.println(iterator.next());// A
			// 10
			// A
			// null
		}
	}
}
