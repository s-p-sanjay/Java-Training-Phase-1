package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for a table :");
		int num = in.nextInt();
		int fact = 1;
		for (int counter = 1; counter <= num; counter++) {
			fact = fact * counter;
			System.out.println(counter + " ! = " + fact);
		}
		in.close();

	}

}
