package com.celcom.day8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteAndCopyExample {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Sanjay_Kumar\\OneDrive - Celcom Solutions\\Desktop\\MyFile.txt");
		FileWriter fw = new FileWriter("C:\\Users\\Sanjay_Kumar\\OneDrive - Celcom Solutions\\Desktop\\MyFileCopy.txt");
		int ch = 0;
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File copied");
	}
}
