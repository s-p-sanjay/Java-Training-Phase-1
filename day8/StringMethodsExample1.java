package com.celcom.day8;

public class StringMethodsExample1 {

	public static void main(String[] args) {
		
		String s1 = "Sanjay";
		System.out.println(s1.length());
		System.out.println(s1.charAt(s1.length()-1));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(" Kumar"));
		System.out.println(s1.replace('y', 'i'));
		System.out.println(s1.equals("sanjay"));
		System.out.println(s1.equalsIgnoreCase("sanjay"));
		System.out.println(s1.contains("jay"));
		System.out.println(s1.startsWith("S"));
		System.out.println(s1.endsWith("s"));
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.substring(2));
		
	}

}
