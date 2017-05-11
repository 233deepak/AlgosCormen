package com.deepak.coreman.ch15;

import java.util.Scanner;

public class CoinExchanger {

	private int[] coins;
	private int[][] cost;

	public int countPossibleExchanges(int n, int j) {
		if (n == 0)
			return 1;
		if (n < 0 || j < 0)
			return 0;

		return countPossibleExchanges(n - coins[j], j)
				+ countPossibleExchanges(n, j - 1);
	}

	public int count(int n, int j) {
		cost = new int[n + 1][j + 1];
		for (int i = 0; i < n + 1; i++)
			for (int c = 0; c < j + 1; c++)
				cost[i][c] = -1;
		int countMinNoOfCoins = countMinNoOfCoins(n, j);
		if (countMinNoOfCoins == Integer.MAX_VALUE - 1
				|| countMinNoOfCoins == Integer.MAX_VALUE)
			return -1;
		else
			return countMinNoOfCoins;
	}

	public int countMinNoOfCoins(int n, int j) {
		if (n == 0)
			return 0;
		if (j < 0 || n < 0)
			return Integer.MAX_VALUE - 1;
		if (cost[n][j] != -1)
			return cost[n][j];

		int min = min(1 + countMinNoOfCoins(n - coins[j], j),
				countMinNoOfCoins(n, j - 1));
		cost[n][j] = min;
		return min;
	}

	private void knapSack() {
		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int money = sc.nextInt();
			

			 coins = new int[n];
			
			int index=0;
			for(;index<n;index++)
				coins[index]= sc.nextInt();

			// Compute and print result
			System.out.println(countMinNoOfCoins(n, coins.length-1));

			t--;
		}

	}
	
	private int min(int i, int j) {
		return (i < j) ? i : j;
	}

	public void setCoins(int[] coins) {
		this.coins = coins;
	}

}
