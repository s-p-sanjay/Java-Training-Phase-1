package com.celcom.saturday_assignment_15_feb_2025;

import java.util.Iterator;

//Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class Assignment6{


	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter "+size+ " elements :");
		for(int i=0;i<size;i++) {
			list.add(s.nextInt());
		}
		System.out.println("LinkedList using simple loop : ");
		for(int i=0;i<list.size();i++) { 
			System.out.print(list.get(i)+"  ");
		}
		System.out.println();
		System.out.println("LinkedList using enhanced loop : ");
		for(Integer i : list) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("LinkedList using Iterator  : ");
		Iterator<Integer> ilist = list.iterator();
		while(ilist.hasNext()) {
			System.out.print(ilist.next()+"  ");
		}
s.close();
	}

}

