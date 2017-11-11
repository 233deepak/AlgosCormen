package com.deepak.coreman.ch15;

public class CoinExchangeMinimizer {

	private int[] coins;

	public int exchange(int value) {

		return exchange(value, coins.length - 1);
	}

	private int exchange(int value, int i) {
		if (i < 0 || value < 0)
			return Integer.MAX_VALUE;
		if (value == 0)
			return 0;

		int left = exchange(value - coins[i], i);
		int right = exchange(value, i - 1);

		if (left == Integer.MAX_VALUE && right == Integer.MAX_VALUE)
			return Integer.MAX_VALUE;

		else {
			return 1 + min(left, right);
		}
	}

	private int min(int j, int k) {
		return (j < k) ? j : k;
	}

	public void setCoins(int[] availableCoins) {
		this.coins = availableCoins;
	}

}
