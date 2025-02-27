package com.celcom.day12;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
	public static void main(String args[]) {
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(4, "Four");
		myMap.put(1, "One");
		myMap.put(null, null);
		myMap.put(3, "Three");
		myMap.put(2, "Two");
		myMap.put(25, "Two");
		for (Map.Entry<Integer, String> e : myMap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("HashMap:" + myMap);
		System.out.println("Contains null key :" + myMap.containsKey(null));
		System.out.println("Contains value Five :" + myMap.containsValue("Five"));
		myMap.merge(25, " Five", (oldVal, newVal) -> oldVal + newVal);
		System.out.println("Merge value for key 25 : " + myMap.get(25));
		myMap.putIfAbsent(3, "tree");
		System.out.println(myMap);
		Map<Integer, String> myMap2 = new HashMap<>();
		myMap2.put(9, "Nine");
		myMap2.put(6, "Six");
		myMap2.put(7, "Seven");
		myMap.putAll(myMap2);
		System.out.println(myMap);
		System.out.println(myMap.equals(myMap2));
		System.out.println("Size of the Map :"+myMap.size());
		System.out.println("Keys : "+myMap.keySet());
		System.out.println("Values : "+myMap.values());
		myMap.clear();
		System.out.println(myMap);
		System.out.println("Map is Empty ? "+myMap.isEmpty());
		
	}
}
