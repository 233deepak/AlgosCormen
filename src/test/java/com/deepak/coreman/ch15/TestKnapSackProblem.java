package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKnapSackProblem {

	@Test
	public void testWithNoItems() throws Exception {
		KanpSackSolver knapsack = new KanpSackSolver();
		int[] profits = new int[] { 1, 2, 3 };
		int[] weights = new int[] { 4, 5, 1 };
		int profit = knapsack.maxiMizeProfit(0,3);
		assertEquals(profit, 0);

	}

	@Test
	public void testWith3Items() throws Exception {
		KanpSackSolver knapsack = new KanpSackSolver();
		int[] profits = new int[] { 1, 2, 3 };
		int[] weights = new int[] { 4, 5, 1 };
		knapsack.setProfits(profits);
		knapsack.setWeights(weights);
		knapsack.setKnapscakCapacity(4);
		int profit = knapsack.maxiMizeProfit();
		assertEquals(profit, 3);

	}
	
	@Test
	public void testWithLarge3Items() throws Exception {
		KanpSackSolver knapsack = new KanpSackSolver();
		int val[] = {60, 100, 120};
	    int wt[] = {10, 20, 30};
		knapsack.setProfits(val);
		knapsack.setWeights(wt);
		knapsack.setKnapscakCapacity(50);
		int profit = knapsack.maxiMizeProfit();
		assertEquals(profit, 220);

	}
	

}
