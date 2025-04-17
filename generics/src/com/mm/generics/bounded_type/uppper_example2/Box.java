package com.mm.generics.bounded_type.uppper_example2;

public class Box<T extends Number & Printable> {

	private T item;

	public Box() {
		super();

	}

	public Box(T item) {
		super();
		this.item = item;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public void dispaly() {
		item.print();
	}
}
