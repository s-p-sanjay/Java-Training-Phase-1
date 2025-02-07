package com.celcom.day4;

public class MethodOverloadingExample2 {

	void addition(int a, int b) {
		System.out.println("Integer Addition : " + (a + b));
	}

	void addition(long a, long b) {
		System.out.println("Long Addition : " + (a + b));
	}

	void addition(double a, double b) {
		System.out.println("Double Addition : " + (a + b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample2 operate = new MethodOverloadingExample2();
		operate.addition(10.5, 23.8);
		operate.addition(25, 45);
		operate.addition(20L, 40L);
	}

}
