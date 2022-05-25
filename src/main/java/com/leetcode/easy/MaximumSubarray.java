package com.leetcode.easy;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int x = maxSubArray(nums);
		
		System.out.println(x);
		
	}
	
	public static int maxSubArray(int[] nums) {
		int current = 0;
		int max = -99999;
		for (int i = 0; i < nums.length; i++) {
			if (current >= 0) {
				current += nums[i];
			} else {
				current = nums[i];
			}
			System.out.println("current="+current);
			if (current > max) {
				max = current;
			}
			System.out.println("max="+max);
		}
		return max;
	}
}
