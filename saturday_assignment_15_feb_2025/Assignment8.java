package com.celcom.saturday_assignment_15_feb_2025;

//Write a Java program to iterate a linked list in reverse order.

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(s.nextInt());
		}
		System.out.println("Original LinkedList : ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Reversed LinkedList : ");
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		s.close();
	}
}
