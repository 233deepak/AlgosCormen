package com.deepak.coreman.ch4;

public class LinearTimeSubArray {

	public int findMaxSubArray(int[] array) {
		int maxGlobal = array[0];
		int maxCurr = array[0];
		for (int j = 1; j < array.length; j++) {
			maxCurr = max(array[j], array[j] + maxCurr);
			if (maxCurr > maxGlobal)
				maxGlobal = maxCurr;
		}
		return maxGlobal;

	}

	private int max(int i, int j) {
		return (i > j) ? i : j;
	}
}
