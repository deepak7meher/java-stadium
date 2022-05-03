package com.leetcode.easy;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		int l = majorityElement(nums);
		System.out.println(l);
	}
	
	public static int majorityElement(int[] nums) {
        
		Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
