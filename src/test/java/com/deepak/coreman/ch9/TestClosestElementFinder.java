package com.deepak.coreman.ch9;

import org.junit.Before;
import org.junit.Test;

public class TestClosestElementFinder {

	private ClosetElementFinder closetElementFinder;

	@Before
	public void init() {
		closetElementFinder = new ClosetElementFinder();
	}

	@Test
	public void testCase1() {
		int array[] = { 1, 3, 8, 2, 0, 7, 6, 5 };
		closetElementFinder.findClosetToMedian(array, 4);
	}

}
