package com.celcom.saturday_assignment_15_feb_2025;
//Write a Java program to sort a given array list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {

	static List<Integer> list = new ArrayList<Integer>();

	static void sortArrayList(List<Integer> list) {
		Collections.sort(list);
		System.out.print("Elements after sorting : ");
		for (Integer i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		int x;
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			x = s.nextInt();
			list.add(x);
		}
		System.out.println("Elements before sorting: " + list);
		sortArrayList(list);
		s.close();
	}

}
