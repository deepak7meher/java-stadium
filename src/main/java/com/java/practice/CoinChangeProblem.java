package com.java.practice;

//Find out total number of ways you can make the change of the given amount using the coins given.
//Condition -> Infinite supply of coins
public class CoinChangeProblem {

	public static void main(String[] args) {
		
		int[] coins = {2,3,5,10};
		int amount = 15;
		
		int totalNoofWays = coinChange(coins, amount);
		System.out.println(totalNoofWays);

	}
	
	public static int coinChange(int[] coins, int amount) {
		
		int result = 0;
		int[][] a = new int[coins.length][amount+1];
		
		for(int i=0; i < coins.length; i++) {
			for(int j=0; j <= amount; j++) {
				
				if(j == 0) {
					a[i][j] = 1;
				} else {
					if(i==0) {
						a[i][j] = (j%coins[i] == 0) ? 1 : 0;
					} else if(coins[i] > j) {
						a[i][j] = a[i-1][j];
					} else {
						a[i][j] = a[i-1][j] + a[i][j-coins[i]];
					}
				}
				System.out.println(a[i][j]);
			}
			System.out.println("\n");
		}
		
		result = a[coins.length-1][amount];
		return result;
	}

}
