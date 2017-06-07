package com.deepak.coreman.ch15;

public class SubMatrixFinder {

	private int[][] matrix;
	private int max = Integer.MIN_VALUE;

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int maxSizeSubArray() {
		int lastRow = matrix.length;
		int lastCol = matrix[0].length;
		maximizeSize(matrix, lastRow - 1, lastCol - 1);
		return max;
	}

	private int maximizeSize(int[][] matrix, int i, int j) {
		int currValue;
		if (i < 0 || j < 0) {
			currValue = 0;
			updateMax(currValue);
			return currValue;
		}

		currValue = matrix[i][j] + min(maximizeSize(matrix, i - 1, j),
				maximizeSize(matrix, i, j - 1),
				maximizeSize(matrix, i - 1, j - 1));
		updateMax(currValue);
		return currValue;
	}

	private void updateMax(int currValue) {
		if (currValue > max) {
			max = currValue;
		}
	}

	private int min(int i, int j, int k) {
		int temp = (i < j) ? i : j;
		return (k < temp) ? k : temp;
	}

}
