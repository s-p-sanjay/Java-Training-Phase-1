package com.celcom.main;

import com.celcom.pack1.MyClass1;
import com.celcom.pack2.MyClass2;
import static java.lang.System.out;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass1 one = new MyClass1();
		one.myMethod1();
		one.myMethod2();
		MyClass2 two = new MyClass2();
		two.myMethod3();
		out.println("static import works");
	}

}
