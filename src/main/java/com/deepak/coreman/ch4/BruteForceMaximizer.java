package com.deepak.coreman.ch4;

public class BruteForceMaximizer {

	public int findMaxSubarraySum(int[] array) {
		return findMaxSubarraySum(array, 0, array.length - 1);
	}

	private int findMaxSubarraySum(int[] array, int low, int high) {
		if (low >= high) {
			return array[low];
		}
		int max = array[low];
		int currSum = max;
		for (int j = low + 1; j <= high; j++) {
			currSum += array[j];
			if (currSum > max) {
				max = currSum;
			}
		}
		return max(max, findMaxSubarraySum(array, low + 1, high));
	}

	private int max(int max, int nextSum) {
		return (max > nextSum) ? max : nextSum;
	}

	public int findMaxSubArray(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			int currentSum = array[i];
			if (currentSum > max)
				max = currentSum;
			for (int j = i + 1; j < array.length; j++) {
				currentSum += array[j];
				if (currentSum > max) {
					max = currentSum;
				}
			}
		}
		return max;
	}
}
