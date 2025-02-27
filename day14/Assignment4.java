package com.celcom.day14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.time.LocalTime;
class Task2 extends Thread{
	public void run() {
		System.out.println("Task : "+Thread.currentThread().getName() +"Current time :"+LocalTime.now());
		System.out.println(Thread.currentThread());
	}
}
public class Assignment4 {
	public static void main(String args[]) {
		ScheduledExecutorService execute = Executors.newSingleThreadScheduledExecutor();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1500);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			execute.submit(new Task2());
			
		}
		execute.shutdown();
	}
}
