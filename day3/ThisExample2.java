package com.celcom.day3;

public class ThisExample2 {
	ThisExample2() {
		this("Sanjay");
		System.out.println("Welcome");
	}

	ThisExample2(String name) {
		this(20);
		System.out.println(name);
	}

	ThisExample2(int i) {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisExample2();
	}

}
