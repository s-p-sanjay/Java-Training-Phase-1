package com.celcom.day2;

class Fruits {
	String name,color;
	int price;
	
	Fruits(String name,String color,int price){
		this.name = name;
		this.color = color;
		this.price = price;
	}
	void display() {
		System.out.println("Fruit name : "+name+"\nFruit color : "+color+"\nFruit price [per kg] : "+price);
	}
	void updatePrice(int price)
	{
		this.price = price;
	}
}
public class ClassAndObject2 {

	public static void main(String[] args) {
		
		Fruits apple = new Fruits("Apple","red",200);

		apple.display();
		apple.updatePrice(250);
		apple.display();
	}

}
