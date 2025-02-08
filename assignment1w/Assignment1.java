package com.celcom.assignment1w;

class Person {
	String personName;
	int personAge;
	Person(String name,int age){
		personName = name;
		personAge = age;
	}
	void display() {
		System.out.println("Person name : "+personName);
		System.out.println("Person age :"+personAge);
	}
}


public class Assignment1 {


	public static void main(String[] args) {
		Person trainer = new Person("Valan",35);
		Person trainee = new Person("Sanjay",22);
		trainer.display();
		trainee.display();
	}

}
