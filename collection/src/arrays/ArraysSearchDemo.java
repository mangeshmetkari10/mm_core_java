package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSearchDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int[] array = { 12, 5, 8, 3, 16 };
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, 12));// 3

		String[] stringArray = { "mangesh", "swara", "pratik", "sangram" };
		Arrays.sort(stringArray);

		System.out.println(Arrays.binarySearch(stringArray, "sangram"));// 2
		Arrays.sort(stringArray, new StringComprator());
		System.out.println(Arrays.binarySearch(stringArray, "sangram"));// 1
	}

}

@SuppressWarnings("rawtypes")
class StringComprator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;

		return str2.compareTo(str1);
	}

}
