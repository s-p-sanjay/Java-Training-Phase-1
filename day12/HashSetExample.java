package com.celcom.day12;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> hashset1 = new HashSet<>();
		hashset1.add("mani");
		hashset1.add("deepak");
		hashset1.add("shervin");
		hashset1.add("karthik");
		System.out.println("hashset 1 "+hashset1);
		Set<String> hashset2 = new HashSet<>();
		hashset2.add("divakar");
		hashset2.add("siva");
		hashset2.add("karthik");
		hashset2.add("ranjith");
		System.out.println("hashset 2 "+hashset2);
		//hashset1.addAll(hashset2);
		//System.out.println("After merging :"+hashset1);
		hashset1.retainAll(hashset2);
		System.out.println("retainsAll : "+hashset1);
		Iterator<String> i = hashset2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Object arr[] = hashset2.toArray();
		System.out.println("to array : ");
		for(Object element :  arr) {
			System.out.print(element+" ");
		}
	}

}
