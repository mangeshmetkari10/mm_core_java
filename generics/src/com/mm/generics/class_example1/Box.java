package com.mm.generics.class_example1;

/*The Box class is defined with a type parameter T. 
This means that T can be any type 
(e.g., Integer, String, CustomClass).*/

// Generic class definition
public class Box<T> {
	private T content;

	// Constructor
	public Box(T content) {
		this.content = content;
	}

	// Getter
	public T getContent() {
		return content;
	}

	// Setter
	public void setContent(T content) {
		this.content = content;
	}

	// Method to display content
	public void displayContent() {
		System.out.println("Content: " + content);
	}
}
