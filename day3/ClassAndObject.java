package com.celcom.day3;

class Mobile
{
	String brand;
	int storage;
	int price;
	Mobile(String brand,int storage,int price)
	{
		this.brand = brand;
		this.storage = storage;
		this.price = price;
	}
	void display() {
		System.out.print("\nMobile brand : "+brand+"\nRam Storage : "+storage+" GB"+"\nPrice : "+price);
	}
	void setPrice(int price) {
		this.price = price;
	}
}
public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile redmi = new Mobile("mi",6,18000);
		redmi.display();
		redmi.setPrice(17000);
		redmi.display();
	}

}
