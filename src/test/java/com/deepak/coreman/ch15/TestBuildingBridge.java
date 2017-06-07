package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBuildingBridge {

	private BuildBridege bridgeBuilder;

	@Before
	public void setUp() {
		bridgeBuilder = new BuildBridege();
	}

	@Test
	public void buildBirdeWithOnePair() throws Exception {
		int[] north = { 10 };
		int[] south = { 6 };
		bridgeBuilder.setNorthCoordinate(north);
		bridgeBuilder.setSouthCoordinate(south);
		int maxNoBridge = bridgeBuilder.maxBridge();
		assertEquals(1, maxNoBridge);

	}

	@Test
	public void buildBirdeWith3Pair() throws Exception {
		int[] north = { 5, 3, 10 };
		int[] south = { 6, 4, 1 };
		bridgeBuilder.setNorthCoordinate(north);
		bridgeBuilder.setSouthCoordinate(south);
		int maxNoBridge = bridgeBuilder.maxBridge();
		assertEquals(2, maxNoBridge);

	}

	@Test
	public void sort3Pair() throws Exception {
		int[] north = { 5, 3, 10 };
		int[] south = { 6, 4, 1 };
		bridgeBuilder.setNorthCoordinate(north);
		bridgeBuilder.setSouthCoordinate(south);
		bridgeBuilder.sort();
		assertArrayEquals(new int[] { 1, 4, 6 }, south);
		assertArrayEquals(new int[] { 10, 3, 5 }, north);

	}

}
