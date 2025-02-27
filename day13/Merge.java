package com.celcom.day13;

import java.util.List;
import java.util.ArrayList;
public class Merge {
	
	public <T> void merge(List<T> list1,List<T> list2) {
		int size = list1.size()+list2.size();
		List<T>  final_list = new ArrayList<>();
		int index = 0;
		while(final_list.size() != size) {
			if(index < list1.size() ) {
			final_list.add(list1.get(index));
			}
			if(index < list2.size()) {
			final_list.add(list2.get(index));
			}
			index++;
		}
		System.out.println(final_list);
	}

	public static void main(String args[]) {
		List<Integer> one = new ArrayList<>();
		one.add(1);
		one.add(2);
		one.add(3);
		List<Integer> two = new ArrayList<>();
		two.add(4);
		two.add(5);
		two.add(6);
		two.add(8);
		new Merge().merge(one, two);
	}
}
