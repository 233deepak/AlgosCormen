package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestOptimalSearchTree {

	private OptimalSearchTree searchTree;

	@Before
	public void setup() {
		searchTree = new OptimalSearchTree();
	}

	@Test
	public void baseCase() throws Exception {
		double[] p = { -1, 0.15, 0.10, 0.05, 0.10, 0.20 };
		double[] q = { 0.05, 0.10, 0.05, 0.05, 0.05, 0.10 };
		searchTree.setKeyProbabilities(p);
		searchTree.setDummyProbabilities(q);
		double cost = searchTree.findOptimalCost();
		assertEquals(2.75, cost, 0.001);

	}

}
