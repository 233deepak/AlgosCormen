package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestMatrixChainMultiplication {

	private MatrixChainMultiplier matrixMultiPlier;

	@Before
	public void setup() {
		matrixMultiPlier = new MatrixChainMultiplier();
	}

	@Test
	public void chainWithOneMatrix() throws Exception {
		int[] dimensions = { 30, 35 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCost(dimensions);
		assertEquals(0, optimalCost);
	}

	@Test
	public void chainWithTwoMatrix() throws Exception {
		int[] dimensions = { 30, 35, 15 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCost(dimensions);
		assertEquals(optimalCost, 30 * 35 * 15);
	}

	@Test
	public void chainWith3Matrix() throws Exception {
		int[] dimensions = { 30, 35, 15, 5 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCost(dimensions);
		assertEquals((35 * 15 * 5) + (30 * 35 * 5), optimalCost);
	}
	
	@Test
	public void chainWith3MatrixWithDP() throws Exception {
		int[] dimensions = { 30, 35, 15, 5 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCostWithMemorization(dimensions);
		assertEquals((35 * 15 * 5) + (30 * 35 * 5), optimalCost);
	}

	@Test
	public void chainWith6Matrix() throws Exception {
		int[] dimensions = { 30, 35, 15, 5, 10, 20, 25 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCost(dimensions);
		assertEquals(15125, optimalCost);
	}

	@Test @Ignore
	public void chainWith20Matrix() throws Exception {
		int[] dimensions = { 30, 35, 15, 5, 10, 20, 25, 30, 35, 15, 5, 10, 20,
				25, 30, 35, 15, 5, 10, 20, 25, 30, 20 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCost(dimensions);
	}
	
	@Test
	public void chainWith20MatrixWithDP() throws Exception {
		int[] dimensions = { 30, 35, 15, 5, 10, 20, 25, 30, 35, 15, 5, 10, 20,
				25, 30, 35, 15, 5, 10, 20, 25, 30, 20 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCostWithMemorization(dimensions);
	}
	
	@Test
	public void getOrderParentheis() throws Exception {
		int[] dimensions = { 30, 35, 15, 5 };
		int optimalCost = matrixMultiPlier
				.OptimalMatrixMultiplicationCostWithMemorization(dimensions);
		assertEquals((35 * 15 * 5) + (30 * 35 * 5), optimalCost);
		String order = matrixMultiPlier.getParenthesis();
		assertEquals("(m1(m2m3))", order);
	}
	
}
