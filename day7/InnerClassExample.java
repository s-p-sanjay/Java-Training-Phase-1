package com.celcom.day7;

interface MyInterface{
	void display();
}

public class InnerClassExample implements MyInterface {

	class InnerClass1{       // non static inner class
		void myMethod1() {
			System.out.println("non static Inner class");
		}
	}
	static class InnerClass2{           // static inner class
		void myMethod2() {
			System.out.println("static inner class");
		}
		
	}
	void myMethod() {
		class InnerClass3{                  // local inner class
			void myMethod3() {
				System.out.println("local inner class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
	}
	public void display() {
		System.out.println("Annonymous inner class");
	}
	public static void main(String[] args) {
		InnerClassExample outer = new InnerClassExample();
		InnerClass1 inner1 = outer.new InnerClass1();   
		inner1.myMethod1();
		InnerClass2 inner2 = new InnerClass2();  // InnerClassExample.new InnerClass2();
		inner2.myMethod2();
		outer.myMethod();
		outer.display();
		MyInterface one = new MyInterface(){   // annonymous inner class

			@Override
			public void display() {
				
				System.out.println("Inside Annonymous inner class");
			}
			
		};
		one.display();
		
		
		
		MyInterface tow = () -> System.out.println("Display");  // lambda expression
		tow.display();
	}

}
