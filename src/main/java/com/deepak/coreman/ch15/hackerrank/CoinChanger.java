package com.deepak.coreman.ch15.hackerrank;

public class CoinChanger {

	private int[] coins;
	private int[][] memory;

	public void setCoins(int[] coins) {
		this.coins = coins;
	}

	public int exchange(int n) {
		memory = new int[n + 1][coins.length];
		for (int i = 0; i < n + 1; i++)
			for (int j = 0; j < coins.length; j++)
				memory[i][j] = -1;
		return exchange(n, coins.length - 1);
	}

	private int exchange(int n, int index) {
		if (n < 0 || index < 0)
			return 0;
		if (n == 0)
			return 1;
		if (memory[n][index] != -1)
			return memory[n][index];
		int ways = exchange(n - coins[index], index) + exchange(n, index - 1);
		memory[n][index] = ways;
		return ways;
	}

}
