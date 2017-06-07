package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMaxSquareSubMatrix {

	private SubMatrixFinder matrixFinder;

	@Before
	public void setup() {
		matrixFinder = new SubMatrixFinder();
	}

	@Test
	public void matrixWithOnerow() throws Exception {
		int[][] matrix = { { 1, 1, 0 } };
		matrixFinder.setMatrix(matrix);
		int size = matrixFinder.maxSizeSubArray();
		assertEquals(1, size);

	}

	@Test
	public void matrixWith3Rows() throws Exception {
		int[][] matrix = { { 1, 1, 0 }, { 0, 1, 1 }, { 1, 1, 1 } };
		matrixFinder.setMatrix(matrix);
		int size = matrixFinder.maxSizeSubArray();
		assertEquals(2, size);
	}

	@Test
	public void matrixWithRectangularMatrix() throws Exception {
		int[][] matrix = { { 0, 1, 1, 0, 1 }, { 1, 1, 0, 1, 0 },
				{ 0, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 0 } };
		matrixFinder.setMatrix(matrix);
		int size = matrixFinder.maxSizeSubArray();
		assertEquals(3, size);

	}
}
