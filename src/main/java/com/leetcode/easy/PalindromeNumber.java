package com.leetcode.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		boolean isPalindrome = isPalindrome(0);
		System.out.println(isPalindrome);
	}

	public static boolean isPalindrome(int x) {
		
		boolean isPalindrome = false;
		String str = null;
		if(x<0) {
			return false;
		} else {
			str = String.valueOf(x);
			for(int i=0; i<= str.length()/2; i++) {
				System.out.println(str.charAt(i));
				System.out.println(str.charAt(str.length()-i-1));
				if(str.charAt(i) != str.charAt(str.length()-i-1)) {
					return false;
				} else {
					isPalindrome = true;
				}
			}
		}
        return isPalindrome;
    }
}
