package com.interview;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		// Fibonacci Series Without using Recursion
		
		int num1=0;
		int num2=1;
		int num3;
		for(int i=2;i<10;++i) {
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
		
		
		
		
	}

}
//output : 1 2 3 5 8 13 21 34