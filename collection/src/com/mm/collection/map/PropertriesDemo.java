package com.mm.collection.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertriesDemo {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputStream = new FileInputStream("abc.properties");

		properties.load(inputStream);
		System.out.println(properties);
		String s = properties.getProperty("mangesh");
		System.out.println(s);//{mangesh=1213, pwd=1410, user=mangesh}
		FileOutputStream outputStream = new FileOutputStream("abc.properties");
		properties.store(outputStream, "updating by SCTP Demo");//1213

	}
}
