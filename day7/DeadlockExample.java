package com.celcom.day7;

class Resource {
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}

class Writer extends Thread {
	Resource res;

	Writer(Resource res) {
		this.res = res;
	}

	public void run() {
		synchronized (res) {
			System.out.println("Writer is writing the data...");
			res.setData("hello");
			res.notify();
		}
	}
}

class Reader extends Thread {
	Resource res;

	Reader(Resource res) {
		this.res = res;
	}

	public void run() {
		synchronized (res) {
			System.out.println("Reader is waiting for the writer...");
			try {
				res.wait();
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("The data is : " + res.getData());
		}
	}
}

public class DeadlockExample {

	public static void main(String[] args) throws InterruptedException {

		Resource myres = new Resource();
		Reader read = new Reader(myres);
		read.start();
		//read.sleep(2000);
		Writer write = new Writer(myres);
		write.start();
	}

}
