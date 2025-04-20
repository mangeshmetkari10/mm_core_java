package com.mm.collection.map;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class MyComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		String str1 =(String) o1;
		String str2 =(String) o2;
		return - str1.compareTo(str2);
	}

}
