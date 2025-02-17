package com.celcom.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {
	
	static void sortList(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			for(int j = i+1 ; j< list.size();j++) {
				
			if(list.get(i) > list.get(j)) {
				int temp = list.get(j);
				list.set(j,list.get(i));
				list.set(i,temp);
			}
		}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> alist = new ArrayList<>();
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			alist.add(s.nextInt());
		}
		System.out.println("Original List : "+alist);
		sortList(alist);
		System.out.println("Sorted list : "+alist);
		s.close();
	}

}
