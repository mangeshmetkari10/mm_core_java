package collection.map;

import java.util.TreeMap;

public class TreeMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException {
		TreeMap treeMap = new TreeMap();
		treeMap.put(100, "Raja");
		treeMap.put(103, "Rani");
		treeMap.put(101, "Rajkumar");
		treeMap.put(102, "Rajkumari");
		// treeMap.put("Mangesh", "Mangesh");//java.lang.ClassCastException
		// treeMap.put(null, "Rajkumari");//java.lang.NullPointerException
		System.out.println(treeMap);
	}
}
