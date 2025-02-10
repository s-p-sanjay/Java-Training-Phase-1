package com.celcom.day5;

interface VehiclePlan1 {
	void noOfEngine();
}

interface VehiclePlan2 {

	void noOfWheels();

	void brandName();
}

abstract class Vehicle implements VehiclePlan1,VehiclePlan2 {
	public void noOfEngine() {
		System.out.println("I have 1 engine");
	}

	public abstract void noOfWheels();

	public abstract void brandName();
}

class Car extends Vehicle {

	@Override
	public void noOfWheels() {
		System.out.println("I have 4 wheels");

	}

	@Override
	public void brandName() {
		System.out.println("My brand is Porche");

	}

}

public class AbstractClassExample1 {
	public static void main(String args[]) {
		Vehicle car = new Car();
		car.noOfEngine();
		car.brandName();
		car.noOfWheels();
	}
}
