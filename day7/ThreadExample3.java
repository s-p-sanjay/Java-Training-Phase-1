package com.celcom.day7;


class MyThread1 implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My Thread Running...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadExample3 {

	public static void main(String[] args) throws InterruptedException  {
		
		Thread t1 = new Thread(new MyThread1());

		System.out.println("Initial state : "+t1.getState());
		t1.setName("karthick");
		System.out.println("Name of the Thread : "+t1.getName());
		System.out.println("Priority of the Thread : "+t1.getPriority());
		
		t1.start();
		
		Thread.sleep(3000);
		t1.suspend();
		System.out.println("state : "+t1.getState());
		t1.resume();
	}
}
