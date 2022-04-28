package com.leetcode.easy;

//https://leetcode.com/problems/longest-common-prefix/
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".
public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"hello","eagle", "apple"};
			//{"flower","flow","flight"}; //-- fl

		String result = longestCommonPrefix(strs);
		System.out.println(result);
		
	}

	public static String longestCommonPrefix(String[] strs) {
		
		
		String firstStr = strs[0];
		
		for (int i=1; i<strs.length; i++) {
			String result = "";
			for(int j=0; j<firstStr.length() && j<strs[i].length(); j++) {
				if(firstStr.charAt(j) == strs[i].charAt(j)) {
					if(result=="") {
						result = String.valueOf(firstStr.charAt(j));
					} else {
						result = result.concat(String.valueOf(firstStr.charAt(j)));
					}
				} else {
					break;
				}
			}
			firstStr = result;
		}
		
		return firstStr;
        
    }
}
