package com.celcom.day12.employeemanagement;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);
		int empId,empAge;
		String empName,empEmail,empAddress;
		System.out.println("Employee Management System");
		System.out.println("==========================");
		int choice;
		do {
		System.out.println(
				"1.Add new Employee\n2.Remove an Employee\n3.View an Employee\n4.View Employees with same age\n5.Exit Application");
		System.out.println("choose : ");
		choice = s.nextInt();
		DataBase db = new DataBase();
		Employee newEmployee;
			if (choice == 1) {
				System.out.println("Enter id : ");
				empId = s.nextInt();
				System.out.println("Enter name : ");
				empName = s.next();
				System.out.println("Enter age : ");
				empAge = s.nextInt();
				System.out.println("Enter address : ");
				empAddress = s.next();
				System.out.println("Enter email : ");
				empEmail = s.next();
				newEmployee = new Employee(empId,empName,empAge,empAddress,empEmail);
				try {
					db.addEmployee(newEmployee);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (choice == 2) {
				System.out.println("Enter the employee id to remove : ");
				try {
					db.removeEmployee(s.nextInt());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (choice == 3) {
				System.out.println("Enter the employee id to display : ");
				try {
					db.displayEmployee(s.nextInt());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (choice == 4) {
				System.out.println("Enter the employee age to retrieve : ");
				try {
					db.displayWithAge(s.nextInt());
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} else if (choice == 5) {
				System.out.println("Thank you!");
				break;
			} else {
				System.out.println("Invalid choice..");
			}

		} while (true);
		s.close();
	}
}
