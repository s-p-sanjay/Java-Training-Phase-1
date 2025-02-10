package com.celcom.saturday_assignment_8_feb_2025;


import java.util.Scanner;

class Shape {
	
	int getArea() {
		System.out.println("Shape class");
		return 0;
	}
}

class Rectangle1 extends Shape {
	int width,height,area;
	Rectangle1(int width, int height) {
		this.width = width;
		this.height = height;
	}

	int getArea() {
		area = width * height;
		return area;
	}
}

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width and height of the rectangle : ");
		int width = input.nextInt();
		int height = input.nextInt();
		Rectangle1 area = new Rectangle1(width,height);
		System.out.println("Area of rectangle : "+area.getArea());
		input.close();
	}

}
