package com.celcom.assignment1w;

class Animal{
	void makeSound() {
		System.out.println("All animals make sound");
	}
}
class Cat extends Animal{       // IS A relation  CAT is a Animal
	void makeSound() {
		System.out.println("Meow.....");
	}
}
public class Assignment8 {

	public static void main(String[] args) {

		Cat  cat = new Cat();
		cat.makeSound();
		
	}

}