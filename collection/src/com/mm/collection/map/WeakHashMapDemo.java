package com.mm.collection.map;

import java.util.WeakHashMap;

public class WeakHashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws InterruptedException {
		WeakHashMap weakHashMap = new WeakHashMap();

		Temp t = new Temp();
		weakHashMap.put(t, "Mangesh");
		System.out.println(weakHashMap);// {temp=Mangesh}

		t = null;
		System.gc();
		Thread.sleep(100);
		System.out.println(weakHashMap);
	}

}
