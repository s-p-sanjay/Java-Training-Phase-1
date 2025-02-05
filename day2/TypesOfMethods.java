package com.celcom.day2;

public class TypesOfMethods {

	void instanceMethod() {
		System.out.println("instance method");
	}
	static void staticMethod() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		TypesOfMethods obj = new TypesOfMethods();
		obj.instanceMethod();
		TypesOfMethods.staticMethod();
	}

}
