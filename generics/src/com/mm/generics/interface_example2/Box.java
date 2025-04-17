package com.mm.generics.interface_example2;

public class Box implements Container<String> {
	private String content;

	// Implementing set method
	@Override
	public void set(String item) {
		this.content = item;
	}

	// Implementing get method
	@Override
	public String get() {
		return content;
	}

	// Method to display content
	public void displayContent() {
		System.out.println(content);
	}
}
