package com.mm.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add("X");
		arrayList.add("A");
		arrayList.add("P");
		arrayList.add("M");
		//arrayList.add(new Integer(10));//java.lang.ClassCastException:
		System.out.println("Before Sorting : " + arrayList);// Before Sorting : [X, A, P, M]
		Collections.sort(arrayList);
		System.out.println("After Sorting : " + arrayList);// After Sorting : [A, M, P, X]

	}

}
