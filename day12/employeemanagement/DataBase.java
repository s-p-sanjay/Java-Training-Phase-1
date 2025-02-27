package com.celcom.day12.employeemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	private static String url = "jdbc:mysql://localhost:3306/Management";
	private static String username = "root";
	private static String password = "12345";
	private static String tableName = "Employee";
	private static Connection conn = null;

	DataBase() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void addEmployee(Employee emp) throws SQLException {
		Statement st = conn.createStatement();
		st.executeUpdate("insert into " + tableName + " values(" + emp.getEmpId() + ",'" + emp.getEmpName() + "',"
				+ emp.getEmpAge() + ",'" + emp.getEmpAddress() + "','" + emp.getEmpEmail() + "');");
		System.out.println("Employee " + emp.getEmpId() + " is created successfully");
	}

	void removeEmployee(int id) throws SQLException {
		Statement st = conn.createStatement();
		st.executeUpdate("delete from " + tableName + " where empid = " + id + ";");
		System.out.println("Employee with id " + id + " has been removed.");
	}

	void displayWithAge(int age) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from " + tableName + " where empage = " + age + ";");
		if (!rs.next()) {
			System.out.println("No result found ");
		} else {
			do {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4)
						+ " " + rs.getString(5));
			}while(rs.next());
		}
	}

	void displayEmployee(int id) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from " + tableName + " where empid = " + id + ";");
		if (!rs.next()) {
			System.out.println("No result found ");
		} else {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4) + " "
					+ rs.getString(5));
		}
	}
	void updateAddress(int id,String address) throws SQLException {
		Statement st = conn.createStatement();
		st.executeUpdate("update "+ tableName + "set  empadress = '" + address + "' where empid = "+id+");");
		System.out.println("Employee with id " + id + " has been updated with new address.");
		
	}
}
