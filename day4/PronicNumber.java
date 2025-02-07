package com.celcom.day4;
import java.util.Scanner;
public class PronicNumber {

	static boolean checkPronic(int n) {
		int i=0,flag = 0;;
		while(i< Math.sqrt(n)) {
			if(i * (i+1) ==  n) {
				flag++;
				break;
			}
			i++;
		}
		if(flag == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		number = input.nextInt();
		if(checkPronic(number)) {
			System.out.println("Pronic");
		}
		else {
			System.out.println("not Pronic");
		}
		input.close();
	}

}
