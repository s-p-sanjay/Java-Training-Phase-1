package com.celcom.day4;

class Vehicle{
	void engine() {
		System.out.println("All vehicle has an engine");
	}
	void wheels() {
		System.out.println("All vehicle has wheels");
	}
}

class Wheels{
	void wheelModel() {
		System.out.println("I have MRF Wheels");
	}
	void noOfWheels(String vehicleType) {
		if(vehicleType.equals("Two Wheeler")) {
			System.out.println("I have two wheels");
		}else if (vehicleType.equals("Four Wheeler")) {
			System.out.println("I have four wheels");
		}
	}
}

class Engine{
	void engineModel() {
		System.out.println("Engine model ABC");
	}
}
class Car extends Vehicle{             // IS A relationship
	Wheels wheel = new Wheels();       // HAS A relationship
	Engine engine = new Engine();      // HAS A relationship
	void engineModel() {
		engine.engineModel();
	}
	void wheelModel() {
		wheel.wheelModel();
	}
	void noOfWheels() {
		wheel.noOfWheels("Four Wheeler");
	}
}
public class IsHasRelationshipExample {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.engine();
		bmw.engineModel();
		bmw.wheels();
		bmw.wheelModel();
		bmw.noOfWheels();
	}

}
