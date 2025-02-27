package com.celcom.day12;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;

public class TreeSetExample {
	public static void main(String[] args) {
		
		Set<Integer> treeset1 = new TreeSet<>();
		treeset1.add(10);
		treeset1.add(30);
		//treeset1.add(null);
		treeset1.add(15);
		System.out.println("treeset 1 "+treeset1);
		Set<Integer> treeset2 = new TreeSet<>();
		treeset2.add(45);
		treeset2.add(20);
		
		treeset2.add(10);
		treeset2.add(15);
		System.out.println("treeset 2 "+treeset2);
		
		treeset1.retainAll(treeset2);
		System.out.println("retainsAll : "+treeset1);
		treeset2.removeAll(treeset2);
		System.out.println("removeAll : "+treeset1);
		treeset1.addAll(treeset2);
		System.out.println("After merging :"+treeset1);
		treeset1.add(40);
		Iterator<Integer> i = treeset1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Object arr[] = treeset1.toArray();
		System.out.println("to array : ");
		for(Object element :  arr) {
			System.out.print(element+" ");
		}

}
}
