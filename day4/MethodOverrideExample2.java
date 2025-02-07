package com.celcom.day4;


class Animal{
	void move() {
		System.out.println("Cannot define");
	}
	void eat() {
		System.out.println("Cannot define");
	}
}
class Dog extends Animal{
	void move() {
		System.out.println("Dog will move by walk");
	}
	void eat() {
		System.out.println("Dogs can eat biscuit");
	}
}
class Fish extends Animal{
	void move() {
		System.out.println("Fish will move by swim");
	}
	void eat() {
		System.out.println("Fish can eat worms");
	}
}
class Eagle extends Animal{
	void move() {
		System.out.println("Eagle will move by fly");
	}
	void eat() {
		System.out.println("Eagle can eat snakes");
	}
}
public class MethodOverrideExample2 {

	public static void main(String[] args) {
		
		Animal animal ;
		animal = new Dog();
		animal.eat();
		animal.move();
		animal = new Fish();
		animal.eat();
		animal.move();
		animal = new Eagle();
		animal.eat();
		animal.move();
	}

}
