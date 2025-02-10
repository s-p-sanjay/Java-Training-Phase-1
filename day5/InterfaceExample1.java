package com.celcom.day5;

interface AnimalPlan{
	void move();
	void eat();
}

abstract class Animal implements AnimalPlan{
	public abstract void move();
	public abstract void eat();
}
class Dog extends Animal{
	public void move() {
		System.out.println("Dog will move by walk");
	}
	public void eat() {
		System.out.println("Dogs can eat biscuit");
	}
}
class Fish extends Animal{
	public void move() {
		System.out.println("Fish will move by swim");
	}
	public void eat() {
		System.out.println("Fish can eat worms");
	}
}
class Eagle extends Animal{
	public void move() {
		System.out.println("Eagle will move by fly");
	}
	public void eat() {
		System.out.println("Eagle can eat snakes");
	}
}
public class InterfaceExample1 {

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
