package com.celcom.day3;

class Super{
	String name = "super";
	Super(){
		System.out.println("I am a super class constructor");
	}
	void superMsg() {
		System.out.println("I am super class");
	}
}
class Sub extends Super{
	Sub(){
		super();
	}
	void callSuper() {
		super.superMsg();
		System.out.println("I am a super class variable : "+super.name);

		System.out.println("Successfully accessed and invoked super class properties");
	}
}
public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub child = new Sub();
		child.callSuper();
	}

}
