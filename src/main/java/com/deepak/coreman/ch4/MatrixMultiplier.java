package com.deepak.coreman.ch4;

public class MatrixMultiplier {

	public int[][] multiplyMatrices(int[][] a, int[][] b) {
		return multiply(a, b, a.length, new MatrixBound(0, a.length - 1, 0,
				a.length - 1),
				new MatrixBound(0, b.length - 1, 0, b.length - 1));

	}

	private int[][] multiply(int[][] a, int[][] b, int length,
			MatrixBound bound, MatrixBound boundB) {
		if (length == 1) {
			int[][] c = new int[1][1];
			c[0][0] = a[bound.topRow][bound.leftColumn]
					* b[boundB.topRow][boundB.leftColumn];
			return c;
		}

		int newSize = length / 2;
		MatrixBound bound1 = new MatrixBound(bound.topRow, bound.topRow
				+ (newSize - 1), bound.leftColumn, bound.leftColumn
				+ (newSize - 1));
		MatrixBound bound2 = new MatrixBound(bound.topRow, bound.topRow
				+ (newSize - 1), bound.leftColumn + newSize, bound.rightColumn);
		MatrixBound bound3 = new MatrixBound(bound.topRow + newSize,
				bound.bottomRow, bound.leftColumn, bound.leftColumn
						+ (newSize - 1));
		MatrixBound bound4 = new MatrixBound(bound.topRow + newSize,
				bound.bottomRow, bound.leftColumn + newSize, bound.rightColumn);

		MatrixBound bound1B = new MatrixBound(boundB.topRow, boundB.topRow
				+ (newSize - 1), boundB.leftColumn, boundB.leftColumn
				+ (newSize - 1));
		MatrixBound bound2B = new MatrixBound(boundB.topRow, boundB.topRow
				+ (newSize - 1), boundB.leftColumn + newSize,
				boundB.rightColumn);
		MatrixBound bound3B = new MatrixBound(boundB.topRow + newSize,
				boundB.bottomRow, boundB.leftColumn, boundB.leftColumn
						+ (newSize - 1));
		MatrixBound bound4B = new MatrixBound(boundB.topRow + newSize,
				boundB.bottomRow, boundB.leftColumn + newSize,
				boundB.rightColumn);

		/*
		 * int[][] c1 = new int[newSize][newSize]; int[][] c2 = new
		 * int[newSize][newSize]; int[][] c3 = new int[newSize][newSize];
		 * int[][] c4 = new int[newSize][newSize];
		 */

		int[][] c = new int[length][length];
		add(multiply(a, b, newSize, bound1, bound1B),
				multiply(a, b, newSize, bound2, bound3B), bound1, c, newSize);
		add(multiply(a, b, newSize, bound1, bound2B),
				multiply(a, b, newSize, bound2, bound4B), bound2, c, newSize);
		add(multiply(a, b, newSize, bound3, bound1B),
				multiply(a, b, newSize, bound4, bound3B), bound3, c, newSize);
		add(multiply(a, b, newSize, bound3, bound2B),
				multiply(a, b, newSize, bound4, bound4B), bound4, c, newSize);
		return c;
	}

	private void add(int[][] tempLeft, int[][] tempRight, MatrixBound bound,
			int[][] c, int newSize) {
		for (int i = (bound.topRow%c.length); i <= (bound.bottomRow%c.length); i++) {
			for (int j = (bound.leftColumn%c.length); j <= (bound.rightColumn%c.length); j++) {
				c[i][j] = tempLeft[(i % newSize)][(j % newSize)]
						+ tempRight[(i % newSize)][(j % newSize)];
			}
		}

	}
	/*
	 * private int[][] multiplyAndAdd(int[][] a, int[][] b, int newSize,
	 * MatrixBound bound, MatrixBound boundB, int[][] c) { int[][] tempLeft =
	 * multiply(a, b, newSize, bound, boundB); int[][] tempRight = multiply(a,
	 * b, newSize, bound, boundB);
	 * 
	 * 
	 * } return c; }
	 */
}
