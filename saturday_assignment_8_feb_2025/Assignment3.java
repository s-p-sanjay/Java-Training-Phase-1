package com.celcom.saturday_assignment_8_feb_2025;

import java.util.Scanner;

class Rectangle {
	int width,height,area,perimeter;
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	void calculateArea() {
		area = width * height;
		System.out.println("Area of Rectangle : " + area);
	}
	void calculatePerimeter() {
		perimeter = 2 * (width + height);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width and height of the rectangle : ");
		int width = input.nextInt();
		int height = input.nextInt();
		Rectangle measure = new Rectangle(width,height);
		measure.calculateArea();
		measure.calculatePerimeter();
		input.close();
	}

}