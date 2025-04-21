package com.mm.multithreading.run_start_method;

public class OverridingStartMethodThread extends Thread {

	@Override
	public synchronized void start() {
		System.out.println(" start Method");
	}

	@Override
	public void run() {
		System.out.println("run method");
	}
}
