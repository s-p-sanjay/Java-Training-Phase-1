package com.celcom.assignment1w;

import java.util.LinkedList;
import java.util.Scanner;


class Account{
	int accountNo;
	long balance;
	String name;
	public Account(int accountNo, long balance, String name) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
	}
}
class Bank{
	LinkedList<Account> accounts = new LinkedList<>(); 
	void addAccount(Account customer) {
		accounts.add(customer);
	}
	void removeAccount(int accountNo) {
		for(Account acc : accounts) {
			if(acc.accountNo == accountNo) {
				System.out.println(acc.name+"'s account has been removed...");
				return;
			}
		}
		System.out.println("Account not found...");
	}
	void deposit(int accountNo,long cash) {
		for(Account acc : accounts) {
			if(acc.accountNo == accountNo) {
				acc.balance += cash;
				System.out.println("successfully deposited..");
				return;
			}
		}
		System.out.println("check your account number...");
	}
	void withdraw(int accountNo,long cash) {
		for(Account acc : accounts) {
			if(acc.accountNo == accountNo) {
				if(acc.balance < cash) {
					System.out.println("Insufficient balance...");
				}
				else {
				acc.balance -= cash;
				System.out.println("succesfully withdrawn..");
				}
				return;
			}
		}
		System.out.println("check your account number...");
	}
	void searchAccount(int accountNo) {
		for(Account acc : accounts) {
			if(acc.accountNo == accountNo) {
				System.out.println(acc.name+"'s account:");
				System.out.println("Account holder \t Account No \t Balance");
				System.out.println(acc.name+" \t "+acc.accountNo+" \t "+acc.balance);
				return;
			}
			System.out.println("Account not found...");
		}
		
	}
}
public class Assignment7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Bank bank = new Bank();
		int choice;
		do{
			System.out.println("1.Add new account \n2.Remove an account \n3.Withdraw \n4.Deposit \n5.Search account \nEnter --> ");
			choice = in.nextInt();
			if (choice == 1) {
				System.out.println("Enter the account number, balance amount and name ..");
				Account newAccount = new Account(in.nextInt(),in.nextLong(),in.next());
				bank.addAccount(newAccount);
			} else if (choice == 2) {
				System.out.println("Enter the account number : ");
				bank.removeAccount(in.nextInt());

			} else if (choice == 3) {
				System.out.println("Enter the Account number and withdraw amount : ");
				bank.withdraw(in.nextInt(),in.nextLong());
			} else if (choice == 4) {
				System.out.println("Enter the Account number and deposit amount : ");
				bank.deposit(in.nextInt(),in.nextLong());
			}
			else if(choice == 5) {
				System.out.println("Enter the Account number : ");
				bank.searchAccount(in.nextInt());
			}
			else if(choice == 6){
				System.out.println("Thank you..!");
				break;
			}else {
				System.out.println("Invalid option ... ");
			}
		}while (choice != 4);
		
	}

}
