package collection.map;

import java.util.TreeMap;

public class TreeMapStringDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException {
		TreeMap treeMapDefaultSorting = new TreeMap();
		treeMapDefaultSorting.put("Raja", 101);
		treeMapDefaultSorting.put("Rani", 402);
		treeMapDefaultSorting.put("Kumar", 423);
		treeMapDefaultSorting.put("Mangesh", 12432);
		System.out.println(treeMapDefaultSorting);// {Kumar=423, Mangesh=12432, Raja=101, Rani=402}

		TreeMap treeMapDescSorting = new TreeMap(new MyComprator());
		treeMapDescSorting.put("Raja", 101);
		treeMapDescSorting.put("Rani", 402);
		treeMapDescSorting.put("Kumar", 423);
		treeMapDescSorting.put("Mangesh", 12432);
		System.out.println(treeMapDescSorting);// {Rani=402, Raja=101, Mangesh=12432, Kumar=423}
	}
}
