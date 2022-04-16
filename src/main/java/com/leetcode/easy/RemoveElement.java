package com.leetcode.easy;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,2,3,0,4,2};
		int result = removeElement(nums, 2);
		//System.out.println(result);
	}
	
	public static int removeElement(int[] nums, int val) {
        
		int k = 0;
		System.out.println("Length:"+nums.length);
		for(int i=0; i<nums.length; i++) {
			System.out.println("------------------"+i);
			System.out.println("Element:-"+nums[i]);
			
			
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
				System.out.println("Element now:-"+nums[i]);
				System.out.println("k="+k);
				
			} 

		}
		System.out.println("------------------");
		for(int i=0; i<nums.length-k; i++) {
			System.out.println(nums[i]);
		}
		
		return k;
    }

}
