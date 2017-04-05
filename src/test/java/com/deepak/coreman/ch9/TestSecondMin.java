package com.deepak.coreman.ch9;

import org.junit.Before;
import org.junit.Test;

public class TestSecondMin {

	private SecondMinFinder minFinder;

	@Before
	public void inti() {
		minFinder = new SecondMinFinder();
	}

	@Test
	public void testCase1() {
		int array[] = { 1, 3, 5, 2, 0, 7, 6, 8 };
		System.out.println(minFinder.findMin(array));
	}
}
