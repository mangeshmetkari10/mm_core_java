package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		arrayList.add("X");
		arrayList.add("A");
		arrayList.add("P");
		arrayList.add("M");
		arrayList.add("a");
		System.out.println(arrayList);// [X, A, P, M, a]
		Collections.sort(arrayList);
		System.out.println(Collections.binarySearch(arrayList, "M"));// 1

		Collections.sort(arrayList, new NewComparator());
		System.out.println(arrayList);// [a, X, P, M, A]
		System.out.println(Collections.binarySearch(arrayList, "M"));// -1
	}

}

@SuppressWarnings("rawtypes")
class NewComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;

		return str2.compareTo(str1);
	}

}
