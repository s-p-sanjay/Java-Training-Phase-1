package com.celcom.day8;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageCopyExample {
	public static void main(String args[]) throws IOException {
		FileInputStream fr = new FileInputStream("D:\\sanjay\\dhoni.jpg");
		FileOutputStream fw = new FileOutputStream("D:\\sanjay\\dhoni1.jpg");
		int ch = 0;
		System.out.println(fr.read());
		while((ch=fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image copied");
	}
}
