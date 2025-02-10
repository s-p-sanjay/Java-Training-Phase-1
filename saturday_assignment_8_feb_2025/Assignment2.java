package com.celcom.saturday_assignment_8_feb_2025;

class Dog{
	String dogName,dogBreed;
	Dog(String name,String breed){
		dogName = name;
		dogBreed = breed;
	}
	
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	void display() {
		System.out.println("Dog name : "+dogName);
		System.out.println("Dog breed : "+dogBreed);
	}
	
}
public class Assignment2 {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Jack","Labrador");
		dog1.display();
		dog1.setDogName("Tom");
		dog1.setDogBreed("Pomeranian");
		dog1.display();
		Dog dog2 = new Dog("Sam","Bulldog");
		dog2.display();
		dog2.setDogName("Oreo");
		dog2.setDogBreed("Beagle");
		dog2.display();
	}

}
