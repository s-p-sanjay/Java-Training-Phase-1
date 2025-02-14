package com.celcom.day9;

public class WrapperClassExample {
	public static void main(String[] args) {

		 int a = 10;
	     Integer x = new Integer(a);    // Boxing
	     System.out.println(x);
	     int b = x.intValue();          // Un-Boxing
	     System.out.println(b);
	     Integer y = a;                 // auto Boxing
	     int c = y;                     // auto Un-Boxing
	     System.out.println(y);
	}

}
