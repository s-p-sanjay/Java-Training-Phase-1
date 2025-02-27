package com.celcom.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



class Task extends Thread{
	public void run() {
		System.out.println("Task : "+Thread.currentThread().getName());
	}
}
public class Assignment2 {
	public static void main(String args[]) {
		ExecutorService execute = Executors.newFixedThreadPool(6);
		for(int i=0;i<10;i++) {
			execute.submit(new Task());
		}
		execute.shutdown();
	}
}
