package com.celcom.day12;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String args[]) {
		Map<Integer, String> linkedMap = new LinkedHashMap<>();
		linkedMap.put(4, "Four");
		linkedMap.put(1, "One");
		linkedMap.put(null, null);
		linkedMap.put(3, "Three");
		linkedMap.put(2, "Two");
		linkedMap.put(25, "Two");
		for (Map.Entry<Integer, String> e : linkedMap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("LinkedHashMap:" + linkedMap);
		System.out.println("Contains key 4 :" + linkedMap.containsKey(4));
		System.out.println("Contains value Five :" + linkedMap.containsValue("Five"));
		linkedMap.merge(25, " Five", (oldVal, newVal) -> oldVal + newVal);
		System.out.println("Merge value for key 25 : " + linkedMap.get(25));
		linkedMap.putIfAbsent(3, "tree");
		System.out.println(linkedMap);
		Map<Integer, String> linkedMap2 = new LinkedHashMap<>();
		linkedMap2.put(9, "Nine");
		linkedMap2.put(6, "Six");
		linkedMap2.put(7, "Seven");
		linkedMap.putAll(linkedMap2);

		System.out.println(linkedMap);
		System.out.println("Keys : " + linkedMap.keySet());
		System.out.println("Values : " + linkedMap.values());
		linkedMap.clear();
		System.out.println(linkedMap);
		System.out.println("Map is Empty ? " + linkedMap.isEmpty());

	}
}