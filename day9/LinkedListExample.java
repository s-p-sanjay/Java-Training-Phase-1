package com.celcom.day9;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class LinkedListExample {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(10); // 1
		list.add(30);
		list.add(10);
		System.out.println(list.get(0)); // 2
		list.add(1, 40); // 3
		System.out.println(list);
		list.set(3, 15); // 4
		System.out.println(list);
		System.out.println("List Traversal using For each:");
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("Traversing using Iterator interface : ");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		list.remove(new Integer(10)); // 5
		System.out.println(list);
		list.remove(1); // 6
		System.out.println(list);
		System.out.println(list.size()); // 7
		System.out.println(list.contains(40)); // 8
		System.out.println(list.isEmpty()); // 9

	}

}
