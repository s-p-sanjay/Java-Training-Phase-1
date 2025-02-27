package com.celcom.day12.employeemanagement;

public class Employee {
	private int empId;
	private String empName, empEmail, empAddress;
	private int empAge;

	public Employee(int empId, String empName, int empAge, String empAddress,String empEmail) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empAddress = empAddress;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
}
