package com.celcom.day13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Create, update, insert, delete a table for a customer detail 
//like(name, dob, address, father name, Aadhar number, phone number etc...) in oracle.
class Customer {

	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "system";
	String passWord = "12345";
	String tableName = "customer";
	Connection conn = null;

	Customer() {
		try {
			conn = DriverManager.getConnection(url, userName, passWord);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	void createTable() throws SQLException {
		Statement st = conn.createStatement();
		st.executeQuery("create table " + tableName
				+ " (name varchar2(20),dob date,address varchar2(20),fathername varchar(20),aadharnumber number primary key,phoneNumber number)");
		System.out.println("Created Table " + tableName);
	}

	void addCustomer(String name, String dob, String address, String fatherName, long aadharNumber, long phoneNumber)
			throws SQLException {
		Statement st = conn.createStatement();
		int affect = st.executeUpdate("insert into " + tableName + " values('" + name + "',to_date('" + dob
				+ "','DD-MM-YYYY'),'" + address + "','" + fatherName + "'," + aadharNumber + "," + phoneNumber + ")");
		// String query = "insert into c"
		// PreparedStatement pst = conn.prepareStatement();
		System.out.println("Inserted affected " + affect + " row");
	}

	void removeCustomer(long aadharNumber) throws SQLException {
		Statement st = conn.createStatement();
		int affect = st.executeUpdate("delete from " + tableName + " where aadharnumber= " + aadharNumber + "");
		System.out.println("Deleted affected " + affect + " row");
	}

	void updateCustomer(long aadharNumber, String newAddress) throws SQLException {
		Statement st = conn.createStatement();
		int affect = st.executeUpdate(
				"update " + tableName + " set address = '" + newAddress + "' where aadharnumber =" + aadharNumber + "");
		System.out.println("Updated... affected " + affect + " row");
	}

	void displayCustomer(long aadharNumber) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from " + tableName + " where aadharnumber= " + aadharNumber);
		rs.next();
		System.out.println("Name : " + rs.getString(1) + "\ndob : " + rs.getDate(2) + "\naddress : " + rs.getString(3)
				+ "\nfathername : " + rs.getString(4) + "\naadhar number : " + rs.getLong(5) + "\nphone number : "
				+ rs.getLong(6));
	}

	void displayAll() throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from " + tableName);
		System.out.println("Database details...");
		while (rs.next()) {
			System.out.println("Name : " + rs.getString(1) + "  dob : " + rs.getDate(2) + "  address : "
					+ rs.getString(3) + "  fathername : " + rs.getString(4) + "  aadhar number : " + rs.getLong(5)
					+ "  phone number : " + rs.getLong(6));
		}
	}

}

public class Main {
	public static void main(String arsg[]) throws SQLException {
		Scanner s = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Customer Management");
		System.out.println("===================");
		int choice;
		do {
			System.out.println(
					"1.addCustomer\n2.deleteCustomer\n3.updateAddress\n4.displayCustomer\n5.display all\n6.createTable\n7.Exit Application");
			System.out.println("Enter choice : ");
			choice = s.nextInt();
			if (choice == 1) {
				System.out.println("Enter Customer name:");
				String name = s.next();
				System.out.println("Enter Customer dob[DD-MM-YYYY]:");
				String dob = s.next();
				System.out.println("Enter Customer address:");
				String address = s.next();
				System.out.println("Enter Customer father name:");
				String fatherName = s.next();
				System.out.println("Enter Customer aadhar number :");
				long aadhar = s.nextLong();
				System.out.println("Enter Customer mobile number :");
				long number = s.nextLong();
				customer.addCustomer(name, dob, address, fatherName, aadhar, number);
			} else if (choice == 2) {
				System.out.println("Enter the aadhar number : ");
				long aadhar = s.nextLong();
				customer.removeCustomer(aadhar);
			} else if (choice == 3) {
				System.out.println("Enter the aadhar number : ");
				long aadhar = s.nextLong();
				System.out.println("Enter the address : ");
				String address = s.next();
				customer.updateCustomer(aadhar, address);
			} else if (choice == 4) {
				System.out.println("Enter the aadhar number :");
				long aadhar = s.nextLong();
				customer.displayCustomer(aadhar);
			} else if (choice == 5) {
				customer.displayAll();
			} else if (choice == 6) {
				customer.createTable();
			} else if (choice == 7) {
				System.out.println("Thank you!");
				break;
			} else {
				System.out.println("Invalid choice");
			}
		} while (true);
		s.close();

	}
}