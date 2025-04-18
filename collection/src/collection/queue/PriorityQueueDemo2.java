package collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		PriorityQueue priorityQueue = new PriorityQueue(new MyComparator());

		priorityQueue.add("A");
		priorityQueue.add("X");
		priorityQueue.add("M");
		priorityQueue.add("S");
		System.out.println(priorityQueue);// [A, S, M, X]
	}

}

@SuppressWarnings("rawtypes")
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String str1 = (String) o1;
		String str2 = (String) o2;
		return str1.compareTo(str2);
	}
}
