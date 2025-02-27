package com.celcom.day12;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String args[]) {
		Map<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(4, "Four");
		treeMap.put(1, "One");
		// treeMap.put(null, null);
		treeMap.put(3, "Three");
		treeMap.put(2, "Two");
		treeMap.put(25, "Two");
		for (Map.Entry<Integer, String> e : treeMap.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("TreeMap:" + treeMap);
		System.out.println("Contains key 4 :" + treeMap.containsKey(4));
		System.out.println("Contains value Five :" + treeMap.containsValue("Five"));
		treeMap.merge(25, " Five", (oldVal, newVal) -> oldVal + newVal);
		System.out.println("Merge value for key 25 : " + treeMap.get(25));
		treeMap.putIfAbsent(3, "tree");
		System.out.println(treeMap);
		Map<Integer, String> treeMap2 = new TreeMap<>();
		treeMap2.put(9, "Nine");
		treeMap2.put(6, "Six");
		treeMap2.put(7, "Seven");
		treeMap.putAll(treeMap2);

		System.out.println(treeMap);
		System.out.println("Keys : " + treeMap.keySet());
		System.out.println("Values : " + treeMap.values());
		treeMap.clear();
		System.out.println(treeMap);
		System.out.println("Map is Empty ? " + treeMap.isEmpty());

	}
}
