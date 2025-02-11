package com.celcom.day6;

import java.io.FileReader;
import java.io.FileNotFoundException;
public class Throwskeyword {
	static void m1() throws FileNotFoundException{
		FileReader f = new FileReader("Abc.txt");
	}
	static void m2() {
		try {
		m1();
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
