package com.celcom.day2;

public class InstanceVsStatic {
	//static int a =20;
	int a = 10;
	public static void main(String args[]) {
		
		InstanceVsStatic obj1 = new InstanceVsStatic();
		InstanceVsStatic obj2 = new InstanceVsStatic();
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		obj1.a=20;
		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
