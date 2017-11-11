package com.deepak.coreman.ch15;

public class MinPoints {

	private RequiredSum[][] memory;

	public int findMinPointsrequired(int[][] array) {
		if (array.length == 0)
			return 0;
		else {
			memory = new RequiredSum[array.length + 1][array[0].length + 1];
			RequiredSum requiredSum = findMin(array, array.length - 1,
					array[0].length - 1);
			return (requiredSum.initialRequirement == Integer.MAX_VALUE) ? 1
					: requiredSum.initialRequirement;
		}

	}

	private RequiredSum findMin(int[][] array, int i, int j) {
		if (i < 0 || j < 0)
			return new RequiredSum(1, Integer.MAX_VALUE);

		if (memory[i][j] != null) {
			return memory[i][j];
		}
		RequiredSum leftMin = findMin(array, i - 1, j);
		RequiredSum rightMin = findMin(array, i, j - 1);
		RequiredSum curreRequiredSum = min(leftMin, rightMin);
		RequiredSum requiredSum = new RequiredSum(curreRequiredSum.currentSum,
				curreRequiredSum.initialRequirement);
		requiredSum.currentSum += array[i][j];
		if (requiredSum.currentSum < 0) {
			adjustSum(requiredSum);
		}
		memory[i][j] = requiredSum;
		return requiredSum;

	}

	private void adjustSum(RequiredSum curreRequiredSum) {
		if (curreRequiredSum.initialRequirement == Integer.MAX_VALUE)
			curreRequiredSum.initialRequirement = 1;

		curreRequiredSum.initialRequirement += (Math
				.abs(curreRequiredSum.currentSum) + 1);
		curreRequiredSum.currentSum = 1;
	}

	private RequiredSum min(RequiredSum leftMin, RequiredSum rightMin) {
		return (leftMin.initialRequirement < rightMin.initialRequirement) ? leftMin
				: rightMin;
	}

}
