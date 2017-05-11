package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.ch9.MaxMinFinder;

public class TesLIS {

	private LIS lis;

	@Before
	public void setup() {
		lis = new LIS();
	}

	@Test
	public void lisOfLength1() throws Exception {
		int[] array = { 10 };
		int maxSum = lis.maxIncresingSequence(array);
		assertEquals(10, maxSum);
	}

	@Test
	public void lisOfLength4() throws Exception {
		int[] array = { 10, 5, 4, 3 };
		int maxSum = lis.maxIncresingSequence(array);
		assertEquals(10, maxSum);
	}
	

	@Test
	public void lisOfLength3() throws Exception {
		int[] array = { 1,11,2};
		int maxSum = lis.maxIncresingSequence(array);
		assertEquals(10, maxSum);
	}

	@Test
	public void lisOfLength6() throws Exception {
		int[] array = { 1, 101, 2, 3, 100, 4, 5 };
		int maxSum = lis.maxIncresingSequence(array);
		assertEquals(106, maxSum);
	}

}
