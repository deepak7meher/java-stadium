package com.java.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		int n = 10;
		for (int i=0; i<n; i++) {
			System.out.println(fibonacci(i));
		}
		
		System.out.println("\n");
		
		int[] series = fibonacci1(10);
		for (int i=0; i<series.length; i++) {
			System.out.println(series[i]);
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
	
	//bottom-top approach. 
	public static int[] fibonacci1(int n) {
		
		int[] a = new int[n];
		
		for (int i=0; i<n; i++) {
			if(i==0) {
				a[i] = 0;
			} else if(i==1) {
				a[i] = 1;
			} else if(i>=2) {
				a[i] = a[i-2] + a[i-1];
			}
		}
		
		return a;
	}
}
