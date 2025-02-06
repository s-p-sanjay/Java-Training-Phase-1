package com.celcom.day3;

class Vehicle1{
	void noOfEngines() {
		System.out.println("Vehicle has Two Engines");	
	}
}
class FourWheeler1 extends Vehicle1{
	void noOfWheels() {
		System.out.println("Has Four Wheels");
	}
}
class Car extends FourWheeler1{
	void brandName() {
		System.out.println("KIA");
	}
}



public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car  kia = new Car();
		kia.noOfEngines();
		kia.noOfWheels();
		kia.brandName();
	}

}
