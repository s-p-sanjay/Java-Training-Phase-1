package com.celcom.day4;

public class JavaBlocks {
	{
		System.out.println("Instance Block");
	}
	{
		System.out.println("Instance Block 1");
	}
	public JavaBlocks() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor Invoked");
	}
	static {
		System.out.println("Static Block");
	}
	@Override
	public String toString() {
		System.out.println("to String");
		return "MyClass";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method Started");
		JavaBlocks java = new JavaBlocks();
		System.out.println("Main method Started");
		System.out.println(java);
	}

}
