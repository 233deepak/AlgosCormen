package com.deepak.coreman.ch15;

public class PallindromePartitioner {

	public int partition(String string) {
		if (string.length() == 1)
			return 1;
		return minPartition(string, 0, string.length() - 1);
	}

	private int minPartition(String string, int i, int j) {
		if (i == j)
			return 1;
		if (isPallindrome(string, i, j))
			return 0;
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int cuts = 1 + minPartition(string, i, k)
					+ minPartition(string, k + 1, j);
			if (cuts < min)
				min = cuts;

		}
		return min;
	}

	private boolean isPallindrome(String string, int i, int j) {
		while (i <= j) {
			if (string.charAt(i) != string.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
