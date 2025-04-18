package collection.set;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.RandomAccess;
import java.util.Set;

public class LinkedHashSetDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedHashSet hashSet = new LinkedHashSet();

		hashSet.add("Mangesh");
		hashSet.add(10001);
		hashSet.add("Mangesh");
		hashSet.add(null);
		System.out.println(hashSet);// [Mangesh, 10001, null]
		System.out.println(hashSet instanceof Serializable);// true
		System.out.println(hashSet instanceof Cloneable);// true
		System.out.println(hashSet instanceof RandomAccess);// false

		Set synchonizedSet = Collections.synchronizedSet(hashSet);
		System.out.println(synchonizedSet);// [Mangesh, 10001, null]
	}

}
