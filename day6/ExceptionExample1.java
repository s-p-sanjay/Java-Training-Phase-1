package com.celcom.day6;

public class ExceptionExample1 {

	public static void main(String[] args) {
		
		System.out.println("Before Exception");
		//int a = 10/0;                                 //ArithmeticException
		//int arr[] = new int[-2];                      //NegativeArrayIndexException
		//System.out.println(arr[4]);                   //ArrayIndexOutOfBoundsException
		//int a = Integer.parseInt("Hi");               //NumberFormatException
		String a = (String)new Object();                //ClassCastException
		System.out.println("After Exception");
	}

}
