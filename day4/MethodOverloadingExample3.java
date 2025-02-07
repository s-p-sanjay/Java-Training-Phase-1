package com.celcom.day4;

public class MethodOverloadingExample3 {
	void concat(int a, int b) {
		System.out.println("Concatenation of Integers : " + a + "" + b);
	}

	void concat(double a, double b) {
		System.out.println("Concatenation of Double : " + a + "" + b);
	}

	void concat(String a, String b) {
		System.out.println("Concatenation of Strings : " + a + "" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample3 perform = new MethodOverloadingExample3();
		perform.concat(20.5, 35.8);
		perform.concat(30, 48);
		perform.concat("Method", "Overloading");
	}

}
