package com.celcom.day7;


class MyThread2 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample4 {

	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		t1.setName("Sanjay");
		MyThread2 t2 = new MyThread2();
		t2.setName("Ranjith");
		t1.start();
		t2.start();
		
		
	}
}
