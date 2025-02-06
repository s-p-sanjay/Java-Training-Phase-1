package com.celcom.day3;
import java.util.Scanner;

class Shape {
	int radius, breadth, length;
	double area, height;

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

	void calculateArea() {
		System.out.println("Shape class");
	}
}

class Rectangle extends Shape {
	Rectangle(int length, int breadth) {
		super(length, breadth);
	}

	void calculateArea() {
		area = length * breadth;
		System.out.println("Area of Rectangle : " + area);
	}
}

class Triangle extends Shape {
	Triangle(int breadth, double height) {
		super(breadth, height);
	}

	void calculateArea() {
		area = (breadth * height) / 2;
		System.out.println("Area of Triangle : " + area);
	}
}

class Circle extends Shape {
	Circle(int radius) {
		super(radius);
	}

	void calculateArea() {
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle : " + area);
	}
}

public class Assignment1 {

	public static void main(String[] args) {

		int choice, length, breadth, radius;
		double height;
		char repeat = 'N';
		Shape area;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Area of Circle\n2.Areaof Rectangle\n3.Area of Triangle");
			System.out.print("Your Choice ---> ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the radius:");
				radius = sc.nextInt();
				area = new Circle(radius);
				area.calculateArea();
				break;
			case 2:
				System.out.println("Enter the length:");
				length = sc.nextInt();
				System.out.println("Enter the breadth:");
				breadth = sc.nextInt();
				area = new Rectangle(length, breadth);
				area.calculateArea();
				break;
			case 3:
				System.out.println("Enter the breadth:");
				breadth = sc.nextInt();
				System.out.println("Enter the height:");
				height = sc.nextDouble();
				area = new Triangle(breadth, height);
				area.calculateArea();
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
