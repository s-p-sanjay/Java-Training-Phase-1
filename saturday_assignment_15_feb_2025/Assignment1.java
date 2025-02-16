package com.celcom.saturday_assignment_15_feb_2025;

//Write a Java program to search for an element in an array list.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {
	static List<Integer> list = new ArrayList<Integer>();

	static int search(int value) {
		return list.indexOf(value);
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(s.nextInt());
		}
		System.out.println("Enter the element to search in a list : ");
		int index = search(s.nextInt());
		if (index > -1) {
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found");
		}
		s.close();
	}

}
