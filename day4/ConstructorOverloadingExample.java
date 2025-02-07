package com.celcom.day4;

public class ConstructorOverloadingExample {
	ConstructorOverloadingExample(int a, int b) {
		this(2.0, 5.5);
		System.out.println("Concatenation of Integers : " + a + "" + b);
	}

	ConstructorOverloadingExample(double a, double b) {
		this("Constructor", "Overloading");
		System.out.println("Concatenation of Double : " + a + "" + b);
	}

	ConstructorOverloadingExample(String a, String b) {
		System.out.println("Concatenation of Strings : " + a + "" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOverloadingExample(10, 20);
	}

}