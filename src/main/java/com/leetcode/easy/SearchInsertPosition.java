package com.leetcode.easy;

//https://leetcode.com/problems/search-insert-position/
public class SearchInsertPosition {

	public static void main(String[] args) {

		int[] nums = {1,3,5,7,9,13};
		int res = searchInsert(nums, 15);
		System.out.println(res);
		
	}
	
	public static int searchInsert(int[] nums, int target) {
		
		int l = 0;
		int r = nums.length-1;
		int mid = (l+r)/2;
		while(l<=r) {
			mid = (l+r)/2;
			if(target == nums[mid]) {
				return mid;
			} else if (target > nums[mid]) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return l;
    }

}
