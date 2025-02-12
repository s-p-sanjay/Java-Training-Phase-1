package com.celcom.day7;

class  TwoTable extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.err.println("2 * "+i+ " = "+(i*2));
			try {
			Thread.sleep(100);
		}
			catch(InterruptedException e) {
				System.out.println(e);
			}
	}
}
}
	class  FiveTable extends Thread{
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("5 * "+i+ " = "+(i*5));
				try {
				Thread.sleep(100);
			}
				catch(InterruptedException e) {
					System.out.println(e);
				}
		}
	}
	}

public class ThreadExample5 {
	
	public static void main(String args[]) throws InterruptedException {
		TwoTable two = new TwoTable();
		FiveTable five = new FiveTable();
		two.start();
		two.join();
		five.start();
	}
}
