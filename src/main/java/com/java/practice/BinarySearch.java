package com.java.practice;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {-1, 3, 4, 7, 9, 23, 35, 78}; 
		int index = search(nums, 30);
		System.out.println(index);
	}
	
	//Binary search-1 -> Find index of target in a sorted array.
	public static int search(int[] nums, int target) {
        int index = -1;
		
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == target) {
        		return i;
        	}
        }
		return index;
    }

}
