package com.deepak.coreman.ch1;

import org.junit.Test;

public class TestSumFinder {

	private Sumfinder sumfinder = new Sumfinder();

	@Test
	public void testCase1() {
		int[] array = { 5, 2, 4, 7, 1, 3, 2, 6 };
		sumfinder.findNumberWithSum(array, 11);
	}

}
