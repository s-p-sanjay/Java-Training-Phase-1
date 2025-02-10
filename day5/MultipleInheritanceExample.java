package com.celcom.day5;

interface One{
	int a = 10; //by default interface variable are public,static and final
}
interface Two{
	int a = 20;
}
interface Three extends One,Two{
	void addition();
}
class Addition implements Three{
	public void addition() {
		System.out.println("Addition result : "+(One.a+Two.a));
	}
}
public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
			Addition add = new Addition();
			add.addition();
	}

}
