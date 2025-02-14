package com.celcom.day9;

import java.util.Vector;
import java.util.Enumeration;
public class VectorExample {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>(4,2);
		System.out.println("Initial Capacity : "+vector.capacity());
		System.out.println("Size : "+vector.size());
		vector.add(20);
		vector.add(30);
		vector.add(50);
		vector.add(10);
		vector.add(5);
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		for(Integer i : vector) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Capacity : "+vector.capacity());
		System.out.println("Vector Elements using enumeration : ");
		Enumeration<Integer> enumerate = vector.elements();
		while(enumerate.hasMoreElements()) {
			System.out.print(enumerate.nextElement() + "  ");
		}
		System.out.println();
		
	}

}
