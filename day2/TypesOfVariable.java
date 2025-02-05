package com.celcom.day2;

public class TypesOfVariable {
	
	static int x =50;
	int instance = 200;
	public static void main(String[] args) {
		
		int local = 10;
		System.out.println("Local variable : "+local);
		
		System.out.println("Instance variable : "+new TypesOfVariable().instance);
		
		System.out.println("Static variable : "+TypesOfVariable.x);
	}

}
