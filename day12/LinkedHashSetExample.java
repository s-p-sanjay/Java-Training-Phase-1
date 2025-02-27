package com.celcom.day12;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
		Set<Integer> linkedhashset1 = new LinkedHashSet<>();
		linkedhashset1.add(10);
		linkedhashset1.add(30);
		//linkedhashset1.add(null);
		linkedhashset1.add(15);
		System.out.println("linkedhashset 1 "+linkedhashset1);
		Set<Integer> linkedhashset2 = new LinkedHashSet<>();
		linkedhashset2.add(45);
		linkedhashset2.add(20);
		linkedhashset2.add(10);
		linkedhashset2.add(15);
		System.out.println("linkedhashset 2 "+linkedhashset2);
		linkedhashset1.retainAll(linkedhashset2);
		System.out.println("retainsAll : "+linkedhashset1);
		linkedhashset2.removeAll(linkedhashset2);
		System.out.println("removeAll : "+linkedhashset1);
		linkedhashset1.addAll(linkedhashset2);
		System.out.println("After merging :"+linkedhashset1);
		linkedhashset1.add(40);
		Iterator<Integer> i = linkedhashset1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Object arr[] = linkedhashset1.toArray();
		System.out.println("to array : ");
		for(Object element :  arr) {
			System.out.print(element+" ");
		}
	}
}
