package com.mm.collection.map;

import java.util.TreeMap;

public class NavigableMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		TreeMap map = new TreeMap();
		map.put("b", "banana");
		map.put("a", "apple");
		map.put("d", "dog");
		map.put("c", "cat");
		map.put("g", "gun");
		System.out.println(map);//{a=apple, b=banana, c=cat, d=dog, g=gun}

		System.out.println(map.ceilingKey("c"));//c
		System.out.println(map.higherKey("c"));//d
		System.out.println(map.floorKey("c"));//c
		System.out.println(map.lowerKey("c"));//b
		System.out.println(map.firstEntry());//a=apple
		System.out.println(map.lastEntry());//g=gun
		System.out.println(map.pollFirstEntry());//a=apple
		System.out.println(map.pollLastEntry());//g=gun
		System.out.println(map.descendingMap());//{d=dog, c=cat, b=banana}
		System.out.println(map);//{b=banana, c=cat, d=dog}
		
		
		
	}

}
