package com.leetcode.easy;

public class MaxProfit {


    public static void main(String[] args) {
        
        int[] prices = {2,4,1};//{7,2,1,5,3,6,4};
        int max = maxProfit1(prices);
        System.out.println(max);
    }

    //Leet-code Accepted, but Time-limit Exceeded for 1 test case 
    //May have to think of another logic with low time complexity.
    public static int maxProfit(int[] prices) {

        int max = 0;
        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                int temp = prices[j] - prices[i];
                if ((prices[i] < prices[j]) && temp > max)
                {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }

    public static int maxProfit1(int[] prices) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        //System.out.println(max);
        //System.out.println(min);
        for(int i=0; i<prices.length; i++) {
            if(min > prices[i]) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }
        }
        return max;
    }
    
}
