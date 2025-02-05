package com.celcom.day2;


class Employee {
	
	int eno;
	String ename;
	double esalary;
	
	Employee(int eno,String ename,double esalary){
		this.eno = eno;
		this.ename = ename;
		this.esalary = esalary;
	}
	
	void display() {
		System.out.println("Employee id : "+eno+"\nEmployee name : "+ename+"\nEmployee salary : "+esalary);
	}
}
public class ClassAndObject1 {

	public static void main(String[] args) {

		Employee sanjay = new Employee(105,"sanjay",35000.00);
		sanjay.display();
		Employee karthi = new Employee(102,"karthi",40000.00);
		karthi.display();

	}

}
