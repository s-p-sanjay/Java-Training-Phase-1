package com.celcom.saturday_assignment_15_feb_2025;
//Write a Java program to reverse elements in an array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(s.nextInt());
		}
		System.out.println("Original ArrayList : ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		Collections.reverse(list);
		System.out.println("Reversed ArrayList : ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();

		s.close();
	}
}