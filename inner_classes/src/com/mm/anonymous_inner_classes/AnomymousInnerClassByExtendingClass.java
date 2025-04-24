package com.mm.anonymous_inner_classes;

public class AnomymousInnerClassByExtendingClass {
	public static void main(String[] args) {
		PopCorn popCorn = new PopCorn() {
			@Override
			public void teste() {
				System.out.println("salty");
			}

		};

		popCorn.teste();
		PopCorn popCorn2 = new PopCorn();
		popCorn2.teste();
	}
}

class PopCorn {
	public void teste() {
		System.out.println("spicy");
	}
}