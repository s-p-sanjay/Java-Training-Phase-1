package com.celcom.day10;

// Write Java program that checks if two arrays contain the same elements.
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> listOne = new ArrayList<>();
		System.out.println("Enter the number of elements in Array List:");
		int size = s.nextInt();
		System.out.println("Input list 1 Enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			listOne.add(s.nextInt());
		}
		List<Integer> listTwo = new ArrayList<>();
		System.out.println("Input List 2 Enter " + size + " elements :");
		for (int i = 0; i < size; i++) {
			listTwo.add(s.nextInt());
		}
		Collections.sort(listOne);
		Collections.sort(listTwo);
		System.out.println("Checking whether the both array has same elements : ");
		boolean flag = true;
		for(int i =0; i< size ;i++) {
			if(listOne.get(i) != listTwo.get(i)) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Both array contains same elements");
		}
		else {
			System.out.println("the two arrays are inequal");
		}
		s.close();
	}

}
