package com.celcom.day3;

class Student{
	private int rollno;
	private String name;
	private int age;
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		Student sanjay = new Student(82,"Sanjay",22);
		System.out.println("Name : "+sanjay.getName()+" \nRoll no : "+sanjay.getRollno()+" \nAge : "+sanjay.getAge());
	}

}
