package com.celcom.day9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

		public static void main(String[] args) throws IOException, ClassNotFoundException{
			
			FileInputStream file = new FileInputStream("D://ObjectFile.txt");
			ObjectInputStream object = new ObjectInputStream(file);
			Employee emp;
			while((emp = (Employee)object.readObject()) != null) {
				System.out.println(emp.getId());
				System.out.println(emp.getName());
				System.out.println(emp.getSalary());
				System.out.println(emp);
			}
			
			object.close();
			file.close();
			//System.out.println("Object saved");
		}

	}
