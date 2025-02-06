package com.celcom.day3;

class A{
	A(){
		System.out.println("A");
	}
	A(int a){
		System.out.println("A 1");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("B");
	}
	B(int a){
		super(a);
		System.out.println("B 1");
	}
}
public class ConstructorInvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B();
	}

}
