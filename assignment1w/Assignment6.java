package com.celcom.assignment1w;

import java.util.Scanner;

class Employee{
	String empName,jobTitle;
	double empSalary;
	Employee(String empName, String jobTitle, double empSalary) {
		this.empName = empName;
		this.jobTitle = jobTitle;
		this.empSalary = empSalary;
	}
	void calculateSalary() {
		System.out.println("Salary Calculation for  "+this.empName);
		System.out.println("Job : "+this.jobTitle+" Salary : "+this.empSalary);
	}
	void updateSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
}
public class Assignment6 {


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name , job title and salary of employee : ");
		Employee emp1 = new Employee(in.nextLine(),in.nextLine(),in.nextDouble());
		emp1.calculateSalary();
		System.out.println("Enter the new Salary");
		emp1.updateSalary(in.nextDouble());
		emp1.calculateSalary();
		in.close();
	}

}
