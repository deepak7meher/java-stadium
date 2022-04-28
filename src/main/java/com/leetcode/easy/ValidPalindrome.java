package com.leetcode.easy;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

	public static void main(String[] args) {

		boolean isPalindrome = isPalindrome("A man, a plan, a canal: Panama");
		System.out.println(isPalindrome);
	}

	public static boolean isPalindrome(String s) {
        
		boolean isPalindrome = true;
		s = s.toLowerCase();
		
		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
		int n = sb.length() -1;
		for(int i=0; i<sb.length()/2; i++) {
			System.out.println(sb.charAt(i)+"--"+sb.charAt(n-i));
			if(sb.charAt(i) != sb.charAt(n-i)) {
				isPalindrome = false;
			}
		}
        
        return isPalindrome;
    }
}
