package com.java.practice;

public class Palindrome {

	public static void main(String[] args) {
		
		String result = palindrome(12321);
		System.out.println(result);
	}
	
	public static String palindrome(int n) {
		
		String result = "Not Palindrome";
		int temp = n;
		int num = 0;
		int r = 0;
		while (n > 0) {
			r = n%10; 
			num = (num*10) + r;
			n = n/10;
		}
		
		if (temp == num) {
			result = "Palindrome";
		}
		
		return result;
	}

}
