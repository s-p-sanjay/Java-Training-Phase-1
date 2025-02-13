package com.celcom.day8;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderExample {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("C:\\Users\\Sanjay_Kumar\\OneDrive - Celcom Solutions\\Desktop\\MyFile.txt");
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			System.out.print((char)ch);
		}
		fr.close();
	}

}
