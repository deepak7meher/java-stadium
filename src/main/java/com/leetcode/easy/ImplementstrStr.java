package com.leetcode.easy;

public class ImplementstrStr {

	public static void main(String[] args) {
		
		int l = strStr("hello","ll");
		System.out.println(l);
	}

	public static int strStr(String haystack, String needle) {
        
        int l = haystack.indexOf(needle);
        return l;
    }
}
