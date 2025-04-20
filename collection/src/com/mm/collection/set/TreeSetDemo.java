package com.mm.collection.set;

import java.io.Serializable;
import java.util.Collections;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeSet hashSet = new TreeSet();

		hashSet.add("Mangesh");
		// hashSet.add(10001); //ClassCastException: hetrogeneous not allowed
		hashSet.add("Yogesh");
		hashSet.add("Mangesh");
		// hashSet.add(null); //NullPointerException
		System.out.println(hashSet);// [Mangesh, Yogesh]
		System.out.println(hashSet instanceof Serializable);// true
		System.out.println(hashSet instanceof Cloneable);// true
		System.out.println(hashSet instanceof RandomAccess);// false

		Set synchonizedSet = Collections.synchronizedSet(hashSet);
		System.out.println(synchonizedSet);// [Mangesh, Yogesh]
	}

}
