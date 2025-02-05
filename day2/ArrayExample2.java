package com.celcom.day2;

import java.util.Scanner;

public class ArrayExample2 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int sum = 0, evenCount = 0, oddCount = 0;
		System.out.println("Initial array values :");
		for (int a : arr) {
			System.out.println(a);
		}
		Scanner read = new Scanner(System.in);
		System.out.println("Enter " + arr.length + " values :");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = read.nextInt();
		}
		for (int a : arr) {
			sum += a;
		}
		System.out.println("Sum of elements : " + sum);
		for (int a : arr) {
			if (a != 0) {
				if (a % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
			}
		}
		System.out.println("No. of Even : " + evenCount);
		System.out.println("No. of Odd : " + oddCount);
		read.close();
	}
}
