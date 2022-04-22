package com.leetcode.easy;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeroes {

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,8,9,0}; //---1,0,0
		//2,3,0,4,6 -- 2,3,4,6,0
		//0,1,0,3,4,6 -- 1,3,4,6,0,0
		
		moveZeroes(nums);
//		for(int i: nums) {
//			System.out.println(i);
//		}
	}
	
	public static void moveZeroes(int[] nums) {
        
		int count = 0;
		
		for(int i=0; i < nums.length-count; i++) {
			System.out.println("nums[i]="+nums[i]);
			if(nums[i] == 0) {
				count++;
				for(int j=i; j<nums.length-count; j++) {
					nums[j] = nums[j+1];
				}
				nums[nums.length-count] = 0;
			}
			System.out.println("-----------");
			for(int k: nums) {
				System.out.println(k);
			}
			System.out.println("-----------");
		}
    }

}
