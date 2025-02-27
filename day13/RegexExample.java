package com.celcom.day13;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String emailRegex = "^[a-zA-Z0-9.-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		String mobileRegex = "^\\d{10}";
		String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[#@!&^%*$+-.?]).{8,}$";
		//Pattern pattern = Pattern.compile(emailRegex);
		System.out.println("Enter the email : ");
		String email = s.next();
		if(Pattern.matches(emailRegex, email)) {
			System.out.println("valid email");
		}
		else {
			System.out.println("Invalid email");
		}
		System.out.println("Enter the mobile number : ");
		String phoneNumber = s.next();
		if(Pattern.matches(mobileRegex, phoneNumber)) {
			System.out.println("valid mobile number");
		}
		else {
			System.out.println("Invalid mobile number");
		}
		System.out.println("Enter the password : ");
		String passWord = s.next();
		if(Pattern.matches(passRegex, passWord)) {
			System.out.println("valid password");
		}
		else {
			System.out.println("Invalid password");
		}
		s.close();
	}
}
