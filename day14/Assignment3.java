package com.celcom.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Task1 extends Thread{
	public void run() {
		System.out.println("Task : "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread());
	}
}
public class Assignment3 {
	public static void main(String args[]) {
		ExecutorService execute = Executors.newCachedThreadPool();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			execute.submit(new Task1());
			
		}
		execute.shutdown();
	}
}
