package com.celcom.day1;

import java.util.Scanner;

public class UserInput {
	public static void main(String a[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter emp id and name..");
		int eid = in.nextInt();
		String ename = in.next();
		System.out.println("Employee Id : " + eid + "\nEmployee name : " + ename);
		in.close();
	}
}
