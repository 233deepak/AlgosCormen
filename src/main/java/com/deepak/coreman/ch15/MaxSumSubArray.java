package com.deepak.coreman.ch15;

public class MaxSumSubArray {

	public int findMaxSubarray(int[] array) {
		if (array.length == 1)
			return array[0];
		if (array.length == 2) {
			return max(array[0], array[1], array[0] + array[1]);
		}

		return find(array, 0, array.length - 1);
	}

	private int find(int[] array, int i, int j) {
		if (i == j) {
			return array[i];
		}

		int mid = (i + j) / 2;
		int left = find(array, i, mid);
		int right = find(array, mid + 1, j);
		int merge = merge(array, i, mid, j);
		return max(left, right, merge);
	}

	private int merge(int[] array, int i, int mid, int j) {
		int leftSum = Integer.MIN_VALUE;
		int index = mid;
		int maxSum = 0;
		while (index >= i) {
			maxSum += array[index];
			if (maxSum > leftSum) {
				leftSum = maxSum;
				index--;
			} else {
				break;
			}
		}

		index = mid+1;
		maxSum =0;
		int rightSum = Integer.MIN_VALUE;
		while (index <= j) {
			maxSum += array[index];
			if (maxSum > rightSum) {
				rightSum = maxSum;
				index++;
			} else {
				break;
			}
		}

		return leftSum + rightSum;
	}

	private int max(int i, int j, int k) {
		int temp = (i > j) ? i : j;
		return (temp > k) ? temp : k;
	}
}
