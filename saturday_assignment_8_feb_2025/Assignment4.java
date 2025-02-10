package com.celcom.saturday_assignment_8_feb_2025;

import java.util.Scanner;

class Circle{
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	void calculateCircumference() {
		
		System.out.println("Circumference of the circle : "+ (2*3.14*radius) );
	}
	void calculateArea() {
		System.out.println("Area of the circle : "+ (3.14*radius*radius));
	}
}
public class Assignment4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		Circle measure = new Circle(in.nextInt());
		measure.calculateArea();
		measure.calculateCircumference();
		in.close();

	}

}
