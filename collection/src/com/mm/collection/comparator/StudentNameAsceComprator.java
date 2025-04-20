package com.mm.collection.comparator;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class StudentNameAsceComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Student student1 = (Student) o1;
		Student student2 = (Student) o2;
		return student1.getName().compareTo(student2.getName());
	}

}
