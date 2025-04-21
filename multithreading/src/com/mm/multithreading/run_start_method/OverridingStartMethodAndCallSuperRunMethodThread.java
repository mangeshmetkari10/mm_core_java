package com.mm.multithreading.run_start_method;

public class OverridingStartMethodAndCallSuperRunMethodThread extends Thread {

	@Override
	public synchronized void start() {
		System.out.println(" start Method");
		super.start();
	}

	@Override
	public void run() {
		System.out.println("run method");
	}
}
