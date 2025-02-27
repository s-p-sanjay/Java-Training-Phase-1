package com.celcom.day12;

import java.sql.*;
public class JavaDataBaseExample {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "12345";
		String query = "create table training (empid int primary key,empname varchar(20));";
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement();
		st.executeUpdate(query);
		System.out.println("Successfully created");
	}
}
