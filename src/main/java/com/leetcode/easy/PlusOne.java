package com.leetcode.easy;

//https://leetcode.com/problems/plus-one/
public class PlusOne {

	public static void main(String[] args) {
		
		int[] digits = {1,2,3}; //1,2,4
		//4,3,2,1 -- 4,3,2,2
		//4,9 --5,0
		//1,9 -- 2,0
		//9,9,9 -- 1,0,0,0
		int[] result = plusOne(digits);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] plusOne(int[] digits) {
		
		int[] res = new int[digits.length+1];
		int count = 0;
		for(int i=digits.length-1; i>=0; i--) {
			if(digits[i] < 9) {
				digits[i] = digits[i] + 1;
				break;
			} else {
				count++;
				digits[i] = 0;
			}
		}
		if(count == digits.length) {
			res[0] = 1;
			return res;
		}
		return digits;
        
    }
}
