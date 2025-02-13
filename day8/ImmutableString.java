package com.celcom.day8;

public class ImmutableString {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat(" World");   //   s1 = s1.concat(" World") 
		System.out.println(s1);   // Java
		
		StringBuffer sb = new StringBuffer();          // ThreadSafe
		sb.append(" World");
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("Java");       // not ThreadSafe
		sb1.append(" World");
		System.out.println(sb1);
		
		StringBuffer s = new StringBuffer();
		System.out.println(s.capacity());
	}

}
