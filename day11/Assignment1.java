package com.celcom.day11;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Assignment1 {
	static Scanner s = new Scanner(System.in);
	static List<Integer> list = new ArrayList<>();	
	
	static void printTransaction(int start,int end) {
		System.out.print("[");
		for(int i = start;i<=end ;i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
	 
		System.out.println("Enter the Amount : ");
		int amount = s.nextInt();
		System.out.println("Enter the total number of Transactions : ");
		int n = s.nextInt();
		System.out.println("Enter all the transactions : ");
		for(int index = 0; index < n ; index++) {
			list.add(s.nextInt());
		}
		boolean flag = false;
		for(int i = 0;i<n;i++) {
			int start = i;
			int sum = list.get(i);
			for(int j =i+1;j<n;j++) {
				int end = j;
				sum = sum+list.get(j);
				if(sum == amount) {
					flag = true;
					System.out.print("Transaction match : ");
					printTransaction(start,end);
					break;
				}
				else if ( sum > amount) {
					break;
				}
			}
		}
		if(! flag) {
			System.out.println("No transactions match the amount");
		}
	}

}
