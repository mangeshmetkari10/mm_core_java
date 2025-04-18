package collection.cursors;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Vector list = new Vector();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);

		Enumeration e = list.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());//A
			//10
			//A
			//null
		}
	}
}
