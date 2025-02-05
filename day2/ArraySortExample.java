package com.celcom.day2;

import java.util.Arrays;

public class ArraySortExample {

	public static void main(String[] args) {
		int arr[] = {12,45,11,14,26,1};
		Arrays.sort(arr);
		System.out.print("Ascending order : ");
		for ( int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println("\nMin value : "+arr[0]);
		System.out.println("2nd Min value : "+arr[1]);
		System.out.println("Max value : "+arr[arr.length-1]);
		System.out.println("2nd Max value : "+arr[arr.length-2]);
		System.out.print("Descending order : ");
		for(int x = arr.length-1; x >= 0;x--) {
			System.out.print(arr[x] + " ");
		}
	}

}
