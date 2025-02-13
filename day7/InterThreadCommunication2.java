package com.celcom.day7;

class SavingsAccount {
	private long balanceAmount = 0;

	void withdraw(long balanceAmount) {
		this.balanceAmount -= balanceAmount;
	}
	void deposit(long balanceAmount) {
		this.balanceAmount += balanceAmount;
	}
	long getBalanceAmount() {
		return this.balanceAmount;
	}
}

class Withdraw extends Thread {
	SavingsAccount account;

	Withdraw(SavingsAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Enter the amount to withdraw : ");
			long amount = new java.util.Scanner(System.in).nextLong();
			if(account.getBalanceAmount() < amount ) {
				System.out.println("Insufficient balance waiting for deposit....");
					try {
						account.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					account.withdraw(amount);
			}
			else {
				account.withdraw(amount);
			}
			
			System.out.println(account.getBalanceAmount()+" withdrawn successfully..");
			System.out.println("Balance : "+account.getBalanceAmount());
		}
	}
}

class Deposit extends Thread {
	SavingsAccount account;

	Deposit(SavingsAccount account) {
		this.account = account;
	}

	public void run() {
		synchronized (account) {
			System.out.println("Enter the amount to deposit : ");
			long amount = new java.util.Scanner(System.in).nextLong();
			account.deposit(amount);
			System.out.println(amount + " deposited successfully");
			System.out.println("Balance : "+account.getBalanceAmount());
			account.notify();
		}
	}
}

public class InterThreadCommunication2 {

	public static void main(String[] args) throws InterruptedException {

		SavingsAccount myaccount = new SavingsAccount();

		Withdraw withdraw = new Withdraw(myaccount);
		withdraw.start();
		withdraw.sleep(5000);
		Deposit deposit = new Deposit(myaccount);
		deposit.start();
	}

}
