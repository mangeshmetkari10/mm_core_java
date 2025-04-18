package collection.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class LinkedHashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked", "removal" })
	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		System.out.println(" hash code of num1 :" +num1.hashCode());
		System.out.println(" hash code of num2 :" +num2.hashCode());
		System.out.println(num1.equals(num2));//true
		System.out.println(num1==num2);//false
		HashMap hashMap = new HashMap();
		IdentityHashMap identityHashMap = new IdentityHashMap();
		hashMap.put(num1, "Mangesh");
		hashMap.put(num2, "Raja");
		System.out.println(hashMap);//{10=Raja}

		identityHashMap.put(num1, "Mangesh");
		identityHashMap.put(num2, "Raja");
		System.out.println(identityHashMap);//{10=Mangesh, 10=Raja}

	}

}
