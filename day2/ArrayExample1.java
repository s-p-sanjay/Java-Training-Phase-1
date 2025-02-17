package com.celcom.day2;
// array example 1
public class ArrayExample1 {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int sum = 0;
		System.out.println("Array Length : " + arr.length);
		for (int curr = 0; curr < arr.length; curr++) {
			System.out.println(arr[curr]);
			sum += arr[curr];
		}
		System.out.println("Sum of elements : " + sum);
		for (int x : arr) {
			System.out.println(x);
		}
	}

}
