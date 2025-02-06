package com.celcom.day3;

public class ThisExample {

	String name;

	ThisExample() {
		this("Sanjay");
	}

	ThisExample(String name) {
		this.name = name;
		display();
	}

	void display() {
		System.out.println("Name is : " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisExample();
	}

}
