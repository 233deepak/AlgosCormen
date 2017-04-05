package com.deepak.coreman.ch4;

import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestMatrixMultiplication {

	private MatrixMultiplier matrixMultiplier = new MatrixMultiplier();

	@Test
	public void testCase1() {
		int[][] a = new int[][] { { 1, 3 }, { 7, 3 } };
		int[][] b = new int[][] { { 6, 8 }, { 4, 2 } };
		ArrayHelper.printArray(matrixMultiplier.multiplyMatrices(a, b));
	}

	@Test
	public void testCase2() {
		int[][] a = new int[][] { { 1, 3, 6, 8 }, { 7, 3, 4, 2 },
				{ 6, 8, 1, 3 }, { 4, 2, 7, 3 } };
		int[][] b = new int[][] { { 6, 8, 1, 3 }, { 4, 2, 7, 3 },
				{ 1, 3, 6, 8 }, { 7, 3, 4, 2 } };
		ArrayHelper.printArray(matrixMultiplier.multiplyMatrices(a, b));
	}

	@Test
	public void testCase3() {
		int[][] a = new int[8][8];
		int[][] b = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				a[i][j] = 1;
				b[i][j] = 1;
			}
		}

		ArrayHelper.printArray(matrixMultiplier.multiplyMatrices(a, b));
	}

}
