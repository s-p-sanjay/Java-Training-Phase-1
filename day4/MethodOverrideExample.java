package com.celcom.day4;

class Company {
	void address() {
		System.out.println("Company location Ramapuram");
	}
}

class Training extends Company {
	void address() {
		System.out.println("Training location Anna nagar");
	}
}

public class MethodOverrideExample {

	public static void main(String[] args) {

		Training location = new Training();
		location.address();
		Company location1 = new Training();
		location1.address();
	}

}
