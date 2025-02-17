package com.celcom.day10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> alist = new ArrayList<>();
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			alist.add(s.nextInt());
		}
		System.out.println("Array list : "+alist+" Type "+alist.getClass());
		
		List<Integer> llist = new LinkedList<>(alist);
		System.out.println("Linked list : "+llist+" Type "+llist.getClass());
		s.close();
		
	}

}
