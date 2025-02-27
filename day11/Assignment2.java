package com.celcom.day11;

import java.util.Scanner;

class Cooking{
	int n;
	double time;
	String foodName,model;

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	double calculateTotalTime() {
		double totalTime = 0;	
		if(foodName.equalsIgnoreCase("pasta")) {
			time += time*(10.0/100);
		}
		else if(foodName.equalsIgnoreCase("frozen meal")) {
			time += time*(20.0/100);
		}
		else {
			
		}
		if(model.equalsIgnoreCase("medium")) {
			time -= time*(10.0/100);
		}
		else if(model.equalsIgnoreCase("low")) {
			time += time*(15.0/100);	
		}
		else {
			
		}
		if(n == 2) {
			totalTime = time + (time*(50.0/100));
		}
		else if(n == 3) {
			totalTime = time * 2;
		}
		else {
			totalTime = time;
		}
		return totalTime;
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Cooking obj = new Cooking();
		double recomTime;
		System.out.println("Enter the number of items: ");
		obj.setN( s.nextInt());
		if(obj.getN() > 3) {
			System.out.println("number of items should be max 3");
			System.exit(0);
		}
		System.out.println( "Enter the heating time for one item (in seconds): ");
		obj.setTime(s.nextDouble());
		s.nextLine();
		System.out.println("Enter the type of food (e.g., pasta, frozen meal, vegetables): ");
		obj.setFoodName(s.nextLine());
		if(!obj.getFoodName().equalsIgnoreCase("pasta") && !obj.getFoodName().equalsIgnoreCase("frozen meal") && !obj.getFoodName().equalsIgnoreCase("vegetables") )
		{
			System.out.println("Unknown food type is entered..");
			System.exit(0);
		}
		System.out.println("Enter the microwave model (high, medium, low): ");
		obj.setModel(s.next());
		recomTime = obj.calculateTotalTime();
		System.out.println("The recommended heating time is: "+recomTime+" seconds.");
		s.close();
	}

}
