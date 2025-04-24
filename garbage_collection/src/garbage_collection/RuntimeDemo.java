package garbage_collection;

import java.util.Date;

public class RuntimeDemo {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Inital Free Memory : " + runtime.freeMemory());
		System.out.println("Total Memory : " + runtime.totalMemory());
		for (int i = 0; i < 100; i++) {
			@SuppressWarnings("unused")
			Date date = new Date();
			date = null;
			System.out.println("Free Memory Before GC : " + runtime.freeMemory());
			runtime.gc();
			System.out.println("Free Memory After GC : " + runtime.freeMemory());
		}
	}
}
