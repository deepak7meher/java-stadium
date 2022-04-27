package com.leetcode.easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {4,5,6,4,6,6,7}; //-- 4,5,6,7
		System.out.println(removeDuplicates(nums));
		for (int l : nums) {
			System.out.println(l);
		}
	}
	
	public static int removeDuplicates1(int[] nums) {
        
		int k = 0;
		int flag = 0;
		nums[k] = nums[0];
		for(int i=1; i<nums.length; i++) {
			//System.out.println("i-nums["+i+"]="+nums[i]);
			for(int j=0; j<i; j++) {
				if(nums[j] != nums[i]) {
					flag = 1;
				} else {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				k++;
				//System.out.println("k="+k);
				nums[k] = nums[i];
				System.out.println("k-nums["+k+"]="+nums[k]);
				flag = 0;
			}
		}
		System.out.println("k="+k);
		for (int l : nums) {
			System.out.println(l);
		}
		return k+1;
    }


}
