package com.leetcode.easy;

//https://leetcode.com/problems/length-of-last-word
public class LengthofLastWord {

	public static void main(String[] args) {

		int l = lengthOfLastWord("I am a good boy");
		System.out.println(l);
	}

	public static int lengthOfLastWord(String s) {
		
		int l = 0;
		String[] sArr = s.split(" ");
		l = sArr[sArr.length-1].length();
		return l;
        
    }
}
