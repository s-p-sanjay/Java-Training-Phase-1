package com.celcom.saturday_assignment_8_feb_2025;

class Vehicle{
	void drive() {
		System.out.println("Every Vehicle will drive");
	}
}
class Car extends Vehicle{               // IS A relation
	void drive() {
		System.out.println("Repairing a car..");
	}
}
public class Assignment9 {

	public static void main(String[] args) {
		
		Vehicle car = new Car();           // dynamic method dispatch
		car.drive();
	}
}
