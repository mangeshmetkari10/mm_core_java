package com.mm.collection.cursors;

import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Vector list = new Vector();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);

		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());// A
			// 10
			// A
			// null
		}
	}
}
