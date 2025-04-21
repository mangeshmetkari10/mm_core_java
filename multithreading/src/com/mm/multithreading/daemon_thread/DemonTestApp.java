package com.mm.multithreading.daemon_thread;

public class DemonTestApp {

	public static void main(String[] args) {
		NewThread thread = new NewThread();
		thread.setDaemon(true);
		thread.start();
		System.out.println("End of main thread");
	}

}
