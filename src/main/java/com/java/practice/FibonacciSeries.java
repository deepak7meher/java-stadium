package com.java.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int n = 10;
		for (int i=0; i<n; i++) {
			System.out.println(fibonacci(i));
		}
	}
	
	//Time complexity of this function is O(2^n)
	//Not the best way to implement fibonacci series
	public static int fibonacci(int n) {
		int sum = 0;
		if(n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			sum = fibonacci(n-2) + fibonacci(n-1);
		}
		return sum;
	}
	
	
}
