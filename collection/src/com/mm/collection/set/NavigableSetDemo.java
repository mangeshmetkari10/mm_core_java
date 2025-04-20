package com.mm.collection.set;

import java.util.TreeSet;

public class NavigableSetDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		TreeSet treeSet = new TreeSet();
		treeSet.add(1202);
		treeSet.add(1203);
		treeSet.add(1204);
		treeSet.add(1205);
		treeSet.add(1206);
		treeSet.add(1207);
		System.out.println(treeSet);// [1202, 1203, 1204, 1205, 1206, 1207]
		System.out.println(treeSet.ceiling(1203));// 1203
		System.out.println(treeSet.higher(1203));// 1204
		System.out.println(treeSet.floor(1204));// 1204
		System.out.println(treeSet.lower(1204));// 1203
		System.out.println(treeSet.pollFirst());// 1202
		System.out.println(treeSet.pollLast());// 1207
		System.out.println(treeSet.descendingSet());// [1206, 1205, 1204, 1203]
		System.out.println(treeSet);// [1203, 1204, 1205, 1206]
	}
}
