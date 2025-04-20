package com.mm.collection.set;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.RandomAccess;
import java.util.Set;

public class HashSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet hashSet = new HashSet();

		hashSet.add("Mangesh");
		hashSet.add(10001);
		hashSet.add("Mangesh");
		hashSet.add(null);
		System.out.println(hashSet);// [null, 10001, Mangesh]
		System.out.println(hashSet instanceof Serializable);// true
		System.out.println(hashSet instanceof Cloneable);// true
		System.out.println(hashSet instanceof RandomAccess);// false

		Set synchonizedSet = Collections.synchronizedSet(hashSet);
		System.out.println(synchonizedSet);// [null, 10001, Mangesh]
	}

}
