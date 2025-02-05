package com.celcom.day1;

public class CommandLineArgument2 {
	public static void main(String a[]) {
		if (a.length == 2) {
			int num1 = Integer.parseInt(a[0]);
			int num2 = Integer.parseInt(a[1]);
			System.out.println("Sum of Arguments :" + (num1 + num2));
		} else {
			System.out.println("insufficient input....");
		}
	}
}
