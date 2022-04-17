package com.leetcode.easy;

import java.util.Arrays;

public class SquaredofSortedArray {

	public static void main(String[] args) {

		int[] nums = {-4,-2,0,3,5};
		int[] result = sortedSquares(nums);
		Arrays.sort(result);
		
		for (int element: result) {
            System.out.println(element);
        }
	}
	
	public static int[] sortedSquares(int[] nums) {
        
        int[] sqArr = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            sqArr[i] = nums[i] * nums [i];
        }
        Arrays.sort(sqArr);
		return sqArr;
    }

}
