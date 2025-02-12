package com.celcom.day7;

public class ThreadExample1 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Thread Name : "+t.getName());
		System.out.println("Thread ID : "+t.getId());
		System.out.println("Thread Priority : "+t.getPriority());
	}

}
