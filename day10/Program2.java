package com.celcom.day10;


class Product{
	String productName;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}

class Producer extends Thread{
	Product product;

	public Producer(Product product) {
		this.product = product;
	}
	public void run() {
		synchronized(product) {
		product.setProductName("Oil");
		System.out.println("Product Updated by producer...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		product.notify();
		}
	}
	
}
class Consumer extends Thread{
	Product product;

	public Consumer(Product product) {
		this.product = product;
	}
	public void run() {
		synchronized(product) {
		System.out.println("Waiting for product....");
		try {
			product.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Successfully purchased."+product.getProductName());
		}
	}
	
}
public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		Product oil = new Product();
		Consumer buy = new Consumer(oil);
		buy.start();
		Thread.sleep(2000);
		Producer sale = new Producer(oil);
		sale.start();
	}

}
