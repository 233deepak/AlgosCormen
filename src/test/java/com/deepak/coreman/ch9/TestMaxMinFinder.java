package com.deepak.coreman.ch9;

import org.junit.Before;
import org.junit.Test;

public class TestMaxMinFinder {

	private MaxMinFinder maxMinFinder;

	@Before
	public void init() {
		maxMinFinder = new MaxMinFinder();
	}

	@Test
	public void testMaxMin() {
		int array[] = { 1, 3, 5, 2, 0, 7, 6, 8 };
		maxMinFinder.findMaxMin(array);

	}

	@Test
	public void testMaxMin2() {
		int array[] = { 1, 3, 5, 2, 0, 7, 9, 6, 8 };
		maxMinFinder.findMaxMin(array);

	}

}
