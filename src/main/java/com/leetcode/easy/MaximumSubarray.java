package com.leetcode.easy;

public class MaximumSubarray {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int x = maxSubArray(nums);
		
		System.out.println(x);
		
	}
	
	public static int maxSubArray(int[] nums) {
		int current_sum = 0;
		int max_sum = -99999;
		for (int i = 0; i < nums.length; i++) {
			if (current_sum >= 0) {
				current_sum += nums[i];
			} else {
				current_sum = nums[i];
			}
			System.out.println("current_sum="+current_sum);
			if (current_sum > max_sum) {
				max_sum = current_sum;
			}
			System.out.println("max_sum="+max_sum);
		}
		return max_sum;
	}
   

}
