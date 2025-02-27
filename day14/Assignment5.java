package com.celcom.day14;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



class doTask implements Callable<Integer>{
	public Integer call() {
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=i;
		}
		return sum;
	}
}
public class Assignment5 {
	public static void main(String args[]) {
		ExecutorService execute = Executors.newSingleThreadExecutor();
			
		Future<Integer> value = execute.submit(new doTask());
		
		try {
			System.out.println("After execution sum of first 20 natural numbers is :"+value.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
			
		execute.shutdown();
	}
}
