package com.deepak.coreman.ch15;

public class MatrixChainMultiplier {

	private int[][] m;
	private int[][] s;

	public int OptimalMatrixMultiplicationCost(int[] dimensions) {

		return findOptimalSolution(dimensions, 1, dimensions.length - 1);
	}

	private int findOptimalSolution(int[] dimensions, int i, int j) {
		if (j == i) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int q = findOptimalSolution(dimensions, i, k)
					+ findOptimalSolution(dimensions, k + 1, j)
					+ dimensions[i - 1] * dimensions[k] * dimensions[j];
			if (q < min) {
				min = q;
			}
		}
		return min;
	}

	public int OptimalMatrixMultiplicationCostWithMemorization(int[] dimensions) {
		m = new int[dimensions.length][dimensions.length];
		s = new int[dimensions.length][dimensions.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = -1;
				s[i][j] = -1;
			}
		}
		return findOptimalSolutionWithMemorization(dimensions, 1,
				dimensions.length - 1);
	}

	private int findOptimalSolutionWithMemorization(int[] dimensions, int i,
			int j) {
		if (j == i) {
			return 0;
		}

		if (m[i][j] != -1) {
			return m[i][j];
		}
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; k++) {
			int q = findOptimalSolutionWithMemorization(dimensions, i, k)
					+ findOptimalSolutionWithMemorization(dimensions, k + 1, j)
					+ dimensions[i - 1] * dimensions[k] * dimensions[j];
			if (q < min) {
				min = q;
				s[i][j] = k;
			}
		}
		m[i][j] = min;
		return min;
	}

	public String getParenthesis() {
		return null;
		
	}
}
