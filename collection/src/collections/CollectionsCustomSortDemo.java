package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsCustomSortDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add("X");
		arrayList.add("A");
		arrayList.add("P");
		arrayList.add("M");
		// arrayList.add(new Integer(10));//java.lang.ClassCastException:
		System.out.println("Before Sorting : " + arrayList);// Before Sorting : [X, A, P, M]

		Collections.sort(arrayList, new MyComparator());
		System.out.println("After  Custom Sorting : " + arrayList);// After Custom Sorting : [X, P, M, A]
	}

}

@SuppressWarnings("rawtypes")
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;

		return str2.compareTo(str1);
	}

}
