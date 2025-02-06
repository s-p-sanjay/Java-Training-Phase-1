package com.celcom.day3;

class Vehicle{
	void noOfEngines() {
		System.out.println("Vehicle has Two Engines");	
	}
}
class FourWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("Has Four Wheels");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheeler car = new FourWheeler();
		car.noOfEngines();
		car.noOfWheels();

	}

}
