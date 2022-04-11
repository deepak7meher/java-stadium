package com.java.practice;

public class CoinChangeProblem {

	public static void main(String[] args) {
		
		int[] coins = {2,3,5,10};
		int amount = 10;
		
		coinChange(coins, amount);

	}
	
	public static int coinChange(int[] coins, int amount) {
		
		int result = 0;
		int[][] a = new int[coins.length][amount+1];
		
		for(int i=0; i < coins.length; i++) {
			for(int j=0; j <= amount; j++) {
				
				
				System.out.println(a[i][j]);
				
			}
			System.out.println("\n");
		}
		
		return result;
	}

}
