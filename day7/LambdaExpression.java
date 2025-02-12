package com.celcom.day7;

interface Calculator{
	int calc(int a,int b);
}
public class LambdaExpression {

	public static void main(String[] args) {

		Calculator calculate = (a,b) -> a+b;
		System.out.println(calculate.calc(10,20)+"  "+ calculate.hashCode());
		calculate = (a,b) -> a*b;
		System.out.println(calculate.calc(5, 15)+"  "+ calculate.hashCode());
	}

}
