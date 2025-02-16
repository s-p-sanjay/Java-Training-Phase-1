package com.celcom.saturday_assignment_15_feb_2025;

//Write a Java program to print all the elements of an ArrayList using the elements' position.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(s.nextInt());
		}
		System.out.println("ArrayList : ");
		System.out.println("Index\tElement");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + "\t" + list.get(i));
		}
		s.close();
	}

}
