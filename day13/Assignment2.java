package com.celcom.day13;

import java.util.Arrays;
import java.util.Scanner;
public class Assignment2 {

	public static <T> boolean checkIfSame(T[] one,T[] two) {
		return Arrays.equals(one, two);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of Array1 and Array2:");
		int size = s.nextInt();
		Integer[] array1 = new Integer[size];
		Integer[] array2 = new Integer[size];
		System.out.println("Enter the Array1 elements:");
		for(int i=0;i<size;i++) {
			array1[i] = s.nextInt();
		}
		System.out.println("Enter the Array2 elements:");
		for(int i=0;i<size;i++) {
			array2[i] = s.nextInt();
		}
		System.out.println("Checking if Two arrays are same : "+checkIfSame(array1,array2));
	}

}
