package com.leetcode.easy;


//https://leetcode.com/problems/climbing-stairs/
public class ClimbStairs {

	public static void main(String[] args) {

		int res = climbStairs(6);
		System.out.println("Result:="+res);
	}

	
	public static int climbStairs1(int n) {
        int res = 0;
        if(n==1) {
            res = 1;
        }
        if(n==2) {
            res = 2;
        }
        
        for(int i=n; i>2; i--) {
        	res = climbStairs(n-1) + climbStairs(n-2);
        }
        
        return res;
            
    }
	
	public static int climbStairs(int n) {
        
		int[] arr = new int[n];
		for(int i =0; i <= n-1; i++) {
			if (i==0) {
				arr[i] = 1;
			} else if (i==1) {
				arr[i] = 2;
			} else {
				arr[i] = arr[i-1] + arr[i-2];
			}
		}
		
		return arr[n-1];
        
    }
}
