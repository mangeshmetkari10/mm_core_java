package com.mm.generics.interface_example1;

public class Box<T> implements Container<T> {
	private T content;

	// Implementing set method
	@Override
	public void set(T item) {
		this.content = item;
	}

	// Implementing get method
	@Override
	public T get() {
		return content;
	}

	// Method to display content
	public void displayContent() {
		System.out.println(content);
	}
}
