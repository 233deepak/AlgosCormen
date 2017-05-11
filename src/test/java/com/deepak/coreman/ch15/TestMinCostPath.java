package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMinCostPath {

	private MinCostPathFinder pathFinder;

	@Before
	public void setup() {
       pathFinder =new MinCostPathFinder();
	}

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void baseCase() throws Exception {
		int[][] cost = new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		pathFinder.setCost(cost);
		int minCost = pathFinder.optimalPath(0,0);
		assertEquals(1, minCost);
	}
	
	@Test
	public void caseWithPathLength4() throws Exception {
		int[][] cost = new int[][] { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };
		pathFinder.setCost(cost);
		int minCost = pathFinder.optimalPath(2,2);
		assertEquals(8, minCost);
	}

}
