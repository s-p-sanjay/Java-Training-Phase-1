package com.celcom.day8;

import java.util.StringTokenizer;
public class StringTokenizerExample {

	static String myMethod() {
		String s="hello";
		return s;
	}
	public static void main(String[] args) {
		
		String s1 = "hello";
		/*StringTokenizer st = new StringTokenizer(s1," ");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}*/
		System.out.println(s1 == StringTokenizerExample.myMethod());
	}

}