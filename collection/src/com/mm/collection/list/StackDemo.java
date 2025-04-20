package com.mm.collection.list;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Stack;

public class StackDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Stack list = new Stack();
		list.push("A");
		list.push(10);
		list.push("A");
		list.push(null);
		System.out.println(list);// [A, 10, A, null]
		list.remove(2);
		System.out.println(list);// [A, 10, null]
		list.pop();
		list.add("N");
		System.out.println(list);// [A, 10, N]
		System.out.println(list instanceof Serializable);// true
		System.out.println(list instanceof Cloneable);// true
		System.out.println(list instanceof RandomAccess);// true

		List newList = Collections.synchronizedList(list);
		System.out.println(newList);// [A, 10, N]
	}
}
