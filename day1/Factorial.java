package com.celcom.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fact = 1;
		System.out.println("Enter a value to find factorial:");
		int num = in.nextInt();
		if (num < 0) {
			System.out.print("please enter a positive number!");
		} else {
			for (int counter = 1; counter <= num; counter++) {
				fact = fact * counter;
			}
			System.out.println(num + " ! = " + fact);
		}
		in.close();

	}

}
