package com.celcom.day9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
class Employee implements Serializable{
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class SerializationExample {

	public static void main(String[] args) throws IOException{
		Employee vizhag = new Employee(201,"Srivizhag",4500);
		Employee karthi = new Employee(202,"Karthi",5500);
		
		
		FileOutputStream file = new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream object = new ObjectOutputStream(file);
		object.writeObject(vizhag);
		object.writeObject(karthi);
		object.close();
		file.close();
		System.out.println("Object saved");
	}

}
