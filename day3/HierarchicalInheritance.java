package com.celcom.day3;

class Bike{
	void noOfWheels() {
		System.out.println("I have two wheels");
	}
}
class Pulsar extends Bike{
	void topSpeed() {
		System.out.println("Top speed is 140 kmph");
	}
}
class BMV extends Bike{
	void topSpeed() {
		System.out.println("Top speed is 200 kmph");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pulsar bike1 = new Pulsar();
		bike1.noOfWheels();
		bike1.topSpeed();
		BMV bike2 = new BMV();
		bike2.noOfWheels();
		bike2.topSpeed();
	}

}

 
 
 
 