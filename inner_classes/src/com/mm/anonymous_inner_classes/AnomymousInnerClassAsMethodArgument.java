package com.mm.anonymous_inner_classes;

public class AnomymousInnerClassAsMethodArgument {
	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 5; i++) {
					System.out.println("child thread");
				}

			}
		});
		thread.start();
		for (int i = 0; i <= 5; i++) {
			System.out.println("main thread");
		}
	}
}