package com.celcom.day8;

import java.util.StringTokenizer;
public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Valan Training";
		StringTokenizer st = new StringTokenizer(s1," ");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
