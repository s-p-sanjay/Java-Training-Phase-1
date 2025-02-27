package com.celcom.day14;

import java.util.Scanner;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

class Customer {
	private int custId;
	private String name;
	private int accNo;
	private int balance;

	// Constructor to initialize customer object with ID, name, and balance
	public Customer(int custId, String name, int accNo, int balance) {
		this.custId = custId;
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}
	// Getter and setter methods for each attribute

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}

class Bank {

	// List to store all customer details
	static List<Customer> customers = new LinkedList<>();
	private String url = "jdbc:oracle:thin:@172.19.0.5:1521/trainingsql.celcom.com";
	private String username = "training";
	private String password = "Celcom123";
	private String table = "Customer";
	Connection conn;

	Bank() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Method to add a customer to the list
	void addCustomer(int id, String name, int accNo, int balance) {
		int affect = 0;
		try {
			Statement st = conn.createStatement();
			affect = st.executeUpdate(
					"insert into " + table + " values(" + id + ",'" + name + "'," + accNo + "," + balance + ")");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if (affect != 0) {
			System.out.println("Successfully stored in a customer DB");
		} else {
			System.out.println("not able to store");
		}
	}

	void deleteCustomer(int id) {
		int affect = 0;
		try {
			Statement st = conn.createStatement();
			affect = st.executeUpdate("delete from " + table + " where id =" + id);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if (affect != 0) {
			System.out.println("Successfully deleted from a customer DB");
		} else {
			System.out.println("not able to delete");
		}

	}

	void displayAll() {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from " + table);
			System.out.println("ID\t\tNAME\t\tACCNO\t\tBALANCE");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3) + "\t\t" + rs.getInt(4));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	void displayCustomerWithRange(int amount) {

		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from " + table + " where balance > " + amount);
			System.out.println("ID\t\tNAME\t\tACCNO\t\tBALANCE");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getInt(3) + "\t\t" + rs.getInt(4));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}


	void withdraw(int id, int amount) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select balance from " + table + " where id = " + id);
			if (rs.next()) {
				int newBalance = rs.getInt(1);
				if (newBalance > amount) {
					newBalance -= amount;
					st.executeUpdate("update " + table + " set balance = " + newBalance + " where id=" + id);
					System.out.println("withdraw completed...");
				} else {
					System.out.println("Insufficient balance..");
				}
			} else {
				System.out.println("Check the customer id");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

	void deposit(int id, int amount) {
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select balance from " + table + " where id = " + id);
			if (rs.next()) {
				int newBalance = rs.getInt(1);
				newBalance += amount;
				st.executeUpdate("update " + table + " set balance = " + newBalance + " where id=" + id);
				System.out.println("deposit completed...");
			} else {
				System.out.println("Check the customer id");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class Assingment1 {

	public static void main(String[] args) throws InterruptedException {
		// Scanner object to take input from the user
		Scanner s = new Scanner(System.in);
		Bank bank = new Bank();
		do {
			// Show menu options to the user
			System.out.println(
					"1.add Customer\n2.remove Customer\n3.displayAll\n4.display with balance\n5.withdraw amount\n6.deposit amount\n7.exit app");
			System.out.println("choose : ");
			int choice = s.nextInt();
			if (choice == 1) {
				System.out.println("Enter customer details 1.id 2.name 3.account number 4.balance : ");
				bank.addCustomer(s.nextInt(), s.next(), s.nextInt(), s.nextInt());
					
			} else if (choice == 2) {
				System.out.println("Enter the customer id :");
				bank.deleteCustomer(s.nextInt());
				
			} else if (choice == 3) {
				bank.displayAll();
			} else if (choice == 4) {
				System.out.println("Enter the minimum balance : ");
				bank.displayCustomerWithRange(s.nextInt());
				
			} else if (choice == 5) {
				System.out.println("Enter 1.customer id 2.amount to withraw:");
				bank.withdraw(s.nextInt(), s.nextInt());
				
			} else if (choice == 6) {
				System.out.println("Enter 1.customer id 2.amount to deposit:");
				bank.deposit(s.nextInt(), s.nextInt());
				
			} else if (choice == 7) {
				System.out.println("Thank you!");
				break;
			} else {
				System.out.println("Invalid");
			}
			
		} while (true);
	}

}
