package com.celcom.saturday_assignment_15_feb_2025;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int size = s.nextInt();
		System.out.println("enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			list.add(s.nextInt());
		}
		System.out.println("LinkedList : ");
		System.out.println("Index\tElement");
		for(Integer i : list) {
			System.out.println(list.indexOf(i)+"\t"+i);
		}
		s.close();
	}

}
