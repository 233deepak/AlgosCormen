package com.deepak.coreman.ch4;

public class ProfitMaximizer {

	public ProfitDuration maximizeProfit(int[] prices) {

		return findMaxSubArrray(getPriceChangeArray(prices));

	}

	private int[] getPriceChangeArray(int[] prices) {
		int[] array = new int[prices.length - 1];
		for (int i = 1; i < prices.length; i++) {
			array[i - 1] = prices[i] - prices[i - 1];
		}
		return array;
	}

	public ProfitDuration findMaxSubArrray(int[] array) {
		return findMaxSubArrray(array, 0, array.length - 1);
	}

	private ProfitDuration findMaxSubArrray(int[] array, int low, int high) {
		if (low >= high) {
			return new ProfitDuration(low, low, array[low]);
		}
		int mid = (low + high) / 2;
		ProfitDuration leftProfit = findMaxSubArrray(array, low, mid);
		ProfitDuration rightProfit = findMaxSubArrray(array, mid + 1, high);
		ProfitDuration crossingProfit = findMaxCrossingSubArray(array, low,
				mid, high);
		return max(leftProfit, rightProfit, crossingProfit);
	}

	private ProfitDuration max(ProfitDuration leftProfit,
			ProfitDuration rightProfit, ProfitDuration crossingProfit) {
		if (leftProfit.profit > rightProfit.profit
				&& leftProfit.profit > crossingProfit.profit)
			return leftProfit;
		else if (rightProfit.profit > leftProfit.profit
				&& rightProfit.profit > crossingProfit.profit) {
			return rightProfit;

		} else {
			return crossingProfit;
		}
	}

	private ProfitDuration findMaxCrossingSubArray(int[] array, int low,
			int mid, int high) {
		int leftSum = Integer.MIN_VALUE;
		int sum = 0;
		int i = mid;
		int maxLeft = -1;
		while (i >= low) {
			sum += array[i];
			if (sum > leftSum) {
				leftSum = sum;
				maxLeft = i;

			}

			/*
			 * else break;
			 */
			i--;

		}

		int rightSum = Integer.MIN_VALUE;
		sum = 0;
		int j = mid + 1;
		int maxRight = -1;
		while (j <= high) {
			sum += array[j];
			if (sum > rightSum) {
				rightSum = sum;
				maxRight = j;
			} /*
			 * else break;
			 */
			j++;
		}
		return new ProfitDuration(maxLeft, maxRight, leftSum + rightSum);
	}

}
