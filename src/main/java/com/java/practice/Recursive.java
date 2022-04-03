package com.java.practice;

public class Recursive {

	public static void main(String[] args) {
		
		int result1 = sum(10);
		System.out.println(result1);
		
		int result2 = sum(5,10);
		System.out.println(result2);
		
		int result3 = factorial(5);
		System.out.println(result3);
		
		int result4 = multiply(3,6);
		System.out.println(result4);

	}
	
	//use recursion to add all numbers 1 to n
	public static int sum(int n) {
		
		int result = 0;
		if(n > 0) {
			result = n + sum(n-1);
		} else {
			result = 0;
		}
		
		return result;
	}
	
	//use recursion to add all numbers between n1 to n2(ex: 5 to 15)
	public static int sum(int n1, int n2) {
		
		int result = 0;
		if (n2 > n1) {
			result = n2 + sum(n1, n2-1);
		} else {
			result = n2;
		}
		
		return result;
	}

	//use resursion to multiply numbers from 1 to n(means factorial -> n!)
	public static int factorial(int n) {
		
		int result = 0;
		if (n > 1) {
			result = n * factorial(n-1);
		} else {
			result = 1;
		}
		return result;
	}
	
	//user recursive to multiply numbers from n1 to n2(ex: 3 to 6 = 3*4*5*6)
	public static int multiply(int n1, int n2) {
		
		int result = 0;
		if (n2 > n1) {
			result = n2 * multiply(n1, n2-1);
		} else {
			result = n2;
		}
		
		return result;
	} 
}
