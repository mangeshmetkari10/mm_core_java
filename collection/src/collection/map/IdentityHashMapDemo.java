package collection.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IdentityHashMapDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		LinkedHashMap hashMap = new LinkedHashMap();
		hashMap.put("mangesh", 1001);
		hashMap.put("yogesh", 40001);
		hashMap.put("rajesh", 2001);
		hashMap.put("raja", 30001);
		hashMap.put("annu", 67001);
		hashMap.put("priya", 70001);
		System.out.println(hashMap);
		// {mangesh=1001, yogesh=40001, rajesh=2001, raja=30001, annu=67001,
		// priya=70001}
		hashMap.put("radha", 44001);
		System.out.println(hashMap);
		// {mangesh=1001, yogesh=40001, rajesh=2001, raja=30001, annu=67001,
		// priya=70001, radha=44001}
		Set keySet = hashMap.keySet();
		System.out.println(keySet);
		Collection values = hashMap.values();// mangesh, yogesh, rajesh, raja, annu, priya, radha]
		System.out.println(values);// [1001, 40001, 2001, 30001, 67001, 70001, 44001]
		Set entrySet = hashMap.entrySet();
		System.out.println(entrySet);
		// [mangesh=1001, yogesh=40001, rajesh=2001, raja=30001, annu=67001,
		// priya=70001, radha=44001]
		Iterator iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Entry) iterator.next();
			System.out.println("key : " + entry.getKey() + "----- value : " + entry.getValue());
			// key : mangesh----- value : 1001
			// key : yogesh----- value : 40001
			// key : rajesh----- value : 2001
			// key : raja----- value : 30001
			// key : annu----- value : 67001
			// key : priya----- value : 70001
			// key : radha----- value : 44001
			if (entry.getKey() == "mangesh") {
				entry.setValue(141089);
			}
		}
		System.out.println(hashMap);
		// {mangesh=141089, yogesh=40001, rajesh=2001, raja=30001, annu=67001,
		// priya=70001, radha=44001}

	}

}
