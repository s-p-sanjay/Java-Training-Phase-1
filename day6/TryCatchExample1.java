package com.celcom.day6;

public class TryCatchExample1 {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try{
			//int a = 10/0;       //ArithmeticException
			int x[] = null;
			System.out.println(x.length);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("After Exception");
	}

}
