package com.celcom.day7;

public class AnnonymousInnerClass1 {

	public static void main(String[] args) {
		
		// annonymous inner class
		Thread running = new Thread(new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Annonymous Hello "+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		//lambda expression
		Runnable runned = () ->{
				for(int i=0;i<5;i++) {
					System.out.println("Lambda Hello "+Thread.currentThread().getName());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
			Thread t = new Thread(runned);
			t.setName("karthi");
			running.setName("sanjay");
			t.setPriority(10);
			running.setPriority(1);
			
			running.start();
			t.start();
			
			 
	}

}
