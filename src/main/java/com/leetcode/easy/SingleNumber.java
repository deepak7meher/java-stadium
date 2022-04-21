package com.leetcode.easy;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {
        
        int[] nums = {2,1,2,3,1,4,4}; //output must be 3
        int output = singleNumber(nums);
        System.out.println(output);

    }


    public static int singleNumber(int[] nums) {
        
    	int[] arr = new int[2];
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
        	if(arr[0] == nums[i]) {
        		arr[0] = 0;
        	} else if(arr[1] == nums[i]) {
        		arr[1] = 0;
        	} else {
        		if(arr[0] ==0) {
        			arr[0] = nums[i];
        		} else {
        			arr[1] = nums[i];
        		}
        	}
        }
        return arr[0];
    }
}