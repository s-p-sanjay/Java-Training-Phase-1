package com.celcom.day8;

public class StringExample2 {

	public static void main(String[] args) {
		String s1 = "Java";
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		for(char c : s1.toCharArray()) {
			System.out.println(c);
		}
	String s2 = "Welcome to Java Programming";
	for(String s : s2.split(" ")) {
		System.out.println(s);
	}
}
}
