package com.java.practice;


//Binary search-1 -> Find index of target in a sorted array.
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] nums = {-1, 3, 4, 7, 9, 23, 35, 78}; 
		//int index1 = search1(nums, 30);
		//System.out.println(index1);
		
		int index2 = search2(nums, 78);
		System.out.println(index2);
	}
	
	
	
	
	//This is implemented as liner search. But not the best way to do.
	//It has the time complexity of O(n)
	//For better solution check the search2() implementation
	public static int search1(int[] nums, int target) {
        int index = -1;
		
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == target) {
        		return i;
        	}
        }
		return index;
    }
	
	
	//Below has the time complexity of O(log n). This is way much faster than search1() function.
	public static int search2(int[] nums, int target) {
        int index = -1;
		int l = 0;
		int r = nums.length - 1;
		int mid = (l+r)/2;
        
        while (l<=r) {
        	if (target == nums[mid]) {
        		return mid;
        	} else if (target > nums[mid]) {
        		l = mid+1;
        		mid = (l+r)/2;
        	} else {
        		r = mid;
        		mid = (l+r)/2;
        	}
        }
        return index;
        
    }
	

}
