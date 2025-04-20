package com.mm.collection.comparator;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class StudentIdDescComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		Student student1 = (Student) o1;
		Student student2 = (Student) o2;

		if (student1.getId() > student2.getId())
			return -1;
		else if (student1.getId() < student2.getId())
			return 1;
		else
			return 0;
	}

}
