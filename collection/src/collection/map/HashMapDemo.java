package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		hashMap.put("mangesh", 1001);
		hashMap.put("yogesh", 40001);
		hashMap.put("rajesh", 2001);
		hashMap.put("raja", 30001);
		hashMap.put("annu", 67001);
		hashMap.put("priya", 70001);
		System.out.println(hashMap);
		// {priya=70001, raja=30001, mangesh=1001, annu=67001,rajesh=2001, yogesh=40001}
		hashMap.put("radha", 44001);
		System.out.println(hashMap);// {priya=70001, raja=30001, mangesh=1001, annu=67001, radha=44001, rajesh=2001,
									// yogesh=40001}
		Set keySet = hashMap.keySet();
		System.out.println(keySet);
		Collection values = hashMap.values();// [priya, raja, mangesh, annu, radha, rajesh, yogesh]
		System.out.println(values);// [70001, 30001, 1001, 67001, 44001, 2001, 40001]
		Set entrySet = hashMap.entrySet();
		System.out.println(entrySet);// [priya=70001, raja=30001, mangesh=1001, annu=67001, radha=44001, rajesh=2001,
										// yogesh=40001]

		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			System.out.println("key : " + entry.getKey() + "----- value : " + entry.getValue());
			// key : priya----- value : 70001
			// key : raja----- value : 30001
			// key : mangesh----- value : 1001
			// key : annu----- value : 67001
			// key : radha----- value : 44001
			// key : rajesh----- value : 2001
			// key : yogesh----- value : 40001
			if (entry.getKey() == "mangesh") {
				entry.setValue(141089);
			}
		}
		System.out.println(hashMap);// {priya=70001, raja=30001, mangesh=141089, annu=67001, radha=44001,
									// rajesh=2001, yogesh=40001}

	}

}
