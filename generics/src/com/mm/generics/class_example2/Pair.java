package com.mm.generics.class_example2;

/*The Box class is defined with a type parameter T. 
This means that T can be any type 
(e.g., Integer, String, CustomClass).*/

// Generic class definition
public class Pair<K, V> {
	private K key;
	private V value;

	public Pair() {
		super();

	}

	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public void displayContent() {
		System.out.println("Pair [key=" + key + ", value=" + value + "]");
	}

}
