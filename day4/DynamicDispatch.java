package com.celcom.day4;

class Animal1{
	int x = 10;
	void eat() {
		System.out.println("Cannot define");
	}
}
class Dog1 extends Animal1{
	int x = 20;
	void eat() {
		System.out.println("Dogs can eat biscuit");
	}
}

public class DynamicDispatch {

	public static void main(String[] args) {
		Animal1 animal;
		animal = new Dog1();
		animal.eat();
		System.out.println(animal.x);
	}

}
