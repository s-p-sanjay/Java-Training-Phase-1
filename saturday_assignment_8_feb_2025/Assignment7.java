package com.celcom.saturday_assignment_8_feb_2025;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

// Class to represent an Account
class Account {
    static int number = 100; // Static variable to keep track of the next available account number
    int accountNo;           
    long balance, mobileNo;  
    String name;             

    // Constructor to initialize account with name and mobile number
    public Account(String name, long mobileNo) {
        this.mobileNo = mobileNo;  
        this.name = name;          
        this.accountNo = number++; // Assign a new account number and increment the static counter
        this.balance = 0;          // Initially, the balance is 0
    }
}

// Class to represent the Bank that holds multiple accounts
class Bank {
    List<Account> accounts = new LinkedList<>(); // List to store the accounts

    // Method to add a new account to the bank
    void addAccount(Account customer) {
        accounts.add(customer); 
        System.out.println("Account is added successfully... ");
        System.out.println("Account number is : " + customer.accountNo); // Display the account number
    }

    // Method to remove an account from the bank
    void removeAccount(int accountNo) {
        // Loop through the accounts to find the one to remove
        for (Account acc : accounts) {
            if (acc.accountNo == accountNo) {
                System.out.println(acc.name + "'s account has been removed..."); // Print a success message
                accounts.remove(acc); // Remove the account from the list
                return; // Exit the method
            }
        }
        // If account not found
        System.out.println("Account not found...");
    }

    // Method to deposit money into an account
    void deposit(int accountNo, long cash) {
        // Loop through the accounts to find the matching account
        for (Account acc : accounts) {
            if (acc.accountNo == accountNo) {
                acc.balance += cash; // Add the deposit amount to the balance
                System.out.println("Successfully deposited..");
                return; // Exit the method
            }
        }
        // If account not found
        System.out.println("Check your account number...");
    }

    // Method to withdraw money from an account
    void withdraw(int accountNo, long cash) {
        // Loop through the accounts to find the matching account
        for (Account acc : accounts) {
            if (acc.accountNo == accountNo) {
                // Check if the account has enough balance
                if (acc.balance < cash) {
                    System.out.println("Insufficient balance..."); // If not enough balance
                } else {
                    acc.balance -= cash; // Subtract the withdrawal amount from the balance
                    System.out.println("Successfully withdrawn..");
                }
                return; // Exit the method
            }
        }
        // If account not found
        System.out.println("Check your account number...");
    }

    // Method to search for an account based on account number
    void searchAccount(int accountNo) {
        // Loop through the accounts to find the matching account
        for (Account acc : accounts) {
            if (acc.accountNo == accountNo) {
                // Print account details
                System.out.println(acc.name + "'s account:");
                System.out.println("Account holder \t Account No \t Balance \t Mobile");
                System.out.println(acc.name + " \t\t " + acc.accountNo + " \t\t " + acc.balance + " \t\t " + acc.mobileNo);
                return; // Exit the method
            }
        }
        // If account not found
        System.out.println("Account not found...");
    }
}

// Main class to simulate the banking system
public class Assignment7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Scanner for user input
        Bank bank = new Bank(); // Create a new bank object
        int choice; 

        // Loop to display the menu and get user input
        do {
            System.out.println(
                    "1.Add new account \n2.Remove an account \n3.Withdraw \n4.Deposit \n5.Search account \n6.Exit \nEnter --> ");
            choice = in.nextInt(); // Get the user's choice

            // Execute the corresponding action based on user's choice
            if (choice == 1) {
                System.out.println("Enter your name and mobile number..");
                Account newAccount = new Account(in.next(), in.nextLong()); 
                bank.addAccount(newAccount); 
            } else if (choice == 2) {
                System.out.println("Enter the account number : ");
                bank.removeAccount(in.nextInt()); 
            } else if (choice == 3) {
                System.out.println("Enter the Account number and withdraw amount : ");
                bank.withdraw(in.nextInt(), in.nextLong()); 
            } else if (choice == 4) {
                System.out.println("Enter the Account number and deposit amount : ");
                bank.deposit(in.nextInt(), in.nextLong()); 
            } else if (choice == 5) {
                System.out.println("Enter the Account number : ");
                bank.searchAccount(in.nextInt()); // Search and display the account details
            } else if (choice == 6) {
                System.out.println("Thank you..!"); // Exit message
                break; // Exit the loop
            } else {
                System.out.println("Invalid option ... "); // Handle invalid choice
            }
        } while (choice != 6); 

        in.close(); // Close the scanner object to release resources
    }
}
