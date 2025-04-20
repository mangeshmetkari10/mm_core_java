package com.mm.collection.list;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

public class VectorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);
		System.out.println(list);// [A, 10, A, null]
		list.remove(2);
		System.out.println(list);// [A, 10, null]
		list.add(2, "M");
		list.add("N");
		System.out.println(list);// [A, 10, M, null, N]
		System.out.println(list instanceof Serializable);// true
		System.out.println(list instanceof Cloneable);// true
		System.out.println(list instanceof RandomAccess);// true

		List newList = Collections.synchronizedList(list);
		System.out.println(newList);// [A, 10, M, null, N]
	}
}
