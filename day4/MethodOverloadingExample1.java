package com.celcom.day4;

public class MethodOverloadingExample1 {
	void print(String name) {
		System.out.println("Your name is : " + name);
	}

	void print(int age) {
		System.out.println("Your age is : " + age);
	}

	void print(double salary) {
		System.out.println("Your salary is :" + salary);
	}

	public static void main(String[] args) {
		MethodOverloadingExample1 employee = new MethodOverloadingExample1();
		employee.print("Sanjay");
		employee.print(22);
		employee.print(42000.0);

	}

}
