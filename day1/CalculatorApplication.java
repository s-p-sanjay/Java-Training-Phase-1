package com.celcom.day1;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Simple Calculator Application");
		char repeat = 'N';
		int num1 = 0, num2 = 0, choice;
		do {
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
			System.out.println("Enter your choice: ");
			choice = in.nextInt();
			if (choice >0 && choice < 5) {
				System.out.println("Enter the values..\n");
				num1 = in.nextInt();
				num2 = in.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Addition value is : " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subraction value is : " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplied value is : " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0) {
					System.out.println("Division value is : " + (num1 / num2));
				} else {
					System.out.print("cannot able to perform division with zero");
				}
				break;
			default:
				System.out.println("Invalid choice..! choose any other option..");
			}
			System.out.println("would you like to continue[Y/N]?");
			repeat = in.next().charAt(0);
		} while (repeat == 'Y' || repeat == 'y');
		System.out.println("Thank you!");
		in.close();
	}

}
