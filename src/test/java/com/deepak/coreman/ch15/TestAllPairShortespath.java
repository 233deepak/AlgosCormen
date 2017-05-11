package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAllPairShortespath {

	private ShortestPath shortestPath;

	@Before
	public void setup() {
		shortestPath = new ShortestPath();
	}

	@Test
	public void shortesPathForSingleNode() throws Exception {
		int[] nodes = { 0 };
		int[][] weights = { { Integer.MAX_VALUE } };
		shortestPath.setNodes(nodes);
		shortestPath.setWeights(weights);
		int[][] shortestDistance = shortestPath.findShortestPath();
		assertArrayEquals(new int[][] { { Integer.MAX_VALUE } },
				shortestDistance);
	}

	@Test
	public void multipleNodes() throws Exception {
		int[] nodes = { 0, 1, 2, 3 };
		int[][] weights = { { 0, 5, Integer.MAX_VALUE, 10 },
				{ Integer.MAX_VALUE, 0, 3, Integer.MAX_VALUE },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1 },
				{ Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0 } };
		shortestPath.setNodes(nodes);
		shortestPath.setWeights(weights);
		int[][] shortestDistance = shortestPath.findShortestPath();
		assertArrayEquals(
				new int[][] {
						{ 0, 5, 8, 9 },
						{ Integer.MAX_VALUE, 0, 3, 4 },
						{ Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 1 },
						{ Integer.MAX_VALUE, Integer.MAX_VALUE,
								Integer.MAX_VALUE, 0 } }, shortestDistance);
	}
}
