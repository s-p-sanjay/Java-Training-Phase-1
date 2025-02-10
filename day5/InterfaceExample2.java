package com.celcom.day5;

import java.util.Scanner;

interface Area {
	void calculateArea();
}

interface Perimeter {
	void calculatePerimeter();
}

abstract class Shape implements Area, Perimeter {
	int radius, breadth, length;
	double area, perimeter, height;
	int side1, side2, side3;

	Shape(int radius) {
		this.radius = radius;
	}

	Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Shape(int breadth, double height) {
		this.height = height;
		this.breadth = breadth;
	}

	Shape(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	public void calculateArea() {
		perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle : " + area);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);

	}

}

class Triangle extends Shape {
	Triangle(int breadth, double height) {
		super(breadth, height);
	}

	Triangle(int side1, int side2, int side3) {
		super(side1, side2, side3);
	}

	@Override
	public void calculatePerimeter() {

		perimeter = side1 + side2 + side3;
		System.out.println("Perimeter of Triangle : " + perimeter);

	}

	public void calculateArea() {
		area = (breadth * height) / 2;
		System.out.println("Area of Triangle : " + area);
	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	public void calculateArea() {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle : " + area);
	}

	@Override
	public void calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = 2 * 3.14 * radius;
		System.out.println("Perimeter of Rectangle : " + perimeter);

	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {

		int choice, length, breadth, radius;
		double height;
		char repeat = 'N';
		Shape area;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Area and Perimeter Calculator...");
			System.out.println("1.Circle\n2.Rectangle\n3.Triangle");
			System.out.print("Your Choice ---> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the radius:");
				radius = sc.nextInt();
				area = new Circle(radius);
				area.calculateArea();
				area.calculatePerimeter();
				break;
			case 2:
				System.out.println("Enter the length:");
				length = sc.nextInt();
				System.out.println("Enter the breadth:");
				breadth = sc.nextInt();
				area = new Rectangle(length, breadth);
				area.calculateArea();
				area.calculatePerimeter();
				break;
			case 3:
				System.out.println("Enter the breadth:");
				breadth = sc.nextInt();
				System.out.println("Enter the height:");
				height = sc.nextDouble();
				area = new Triangle(breadth, height);
				area.calculateArea();
				System.out.println("Enter three sides : ");
				area = new Triangle(sc.nextInt(), sc.nextInt(), sc.nextInt());
				area.calculatePerimeter();
				break;
			default:
				System.out.println("Invalid option.. choose any other..");
			}
			System.out.println("Do you wish to continue [Y/N]?  ");
			repeat = sc.next().charAt(0);
		} while (repeat == 'Y' || repeat == 'y');
		System.out.println("Thank you!");
		sc.close();
	}

}
