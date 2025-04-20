package com.mm.exception_handling.try_resources;

import java.io.FileOutputStream;

public class TryWithSingleResourcesExample {
	public static void main(String args[]) {
		try (FileOutputStream fos = new FileOutputStream("gfgtextfile.txt")) {

			String text = "Hello World. This is my java program";
			byte arr[] = text.getBytes();
			fos.write(arr);
		}

		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resource are closed and message has been written into the gfgtextfile.txt");
	}
}