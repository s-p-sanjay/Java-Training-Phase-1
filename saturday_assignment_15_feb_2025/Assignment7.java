package com.celcom.saturday_assignment_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(s.nextInt());
		}
		System.out.println("Enter the start index to traverse :");
		int start = s.nextInt();
		if (start >= 0 && start < list.size()) {
			System.out.println("LinkedList from index " + start + " : ");
			for (int i = start; i < list.size(); i++) {
				System.out.print(list.get(i) + "  ");
			}
		} else {
			System.out.println("Invalid position...");
		}
		System.out.println();
		s.close();
	}
}
