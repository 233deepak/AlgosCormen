package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestContiniousSubarray {

	private MaxSumSubArray maxSumSubArray;

	@Before
	public void setUp() {
		maxSumSubArray = new MaxSumSubArray();
	}

	@Test
	public void sumOfArrayhavingOneElement() throws Exception {
		int[] array = { -1 };
		int sum = maxSumSubArray.findMaxSubarray(array);
		assertEquals(-1, sum);
	}

	@Test
	public void sumOfArrayhavingTwoElement() throws Exception {
		int[] array = { -1, 2 };
		int sum = maxSumSubArray.findMaxSubarray(array);
		assertEquals(2, sum);
	}

	@Test
	public void sumOfArrayhaving3Element() throws Exception {
		int[] array = { -1, 2, 3 };
		int sum = maxSumSubArray.findMaxSubarray(array);
		assertEquals(5, sum);
	}

	@Test
	public void sumOfArrayhaving5Element() throws Exception {
		int[] array = { -1, -2, -3, -4 };
		int sum = maxSumSubArray.findMaxSubarray(array);
		assertEquals(-1, sum);
	}

	@Test
	public void sumOfArrayhaving8Element() throws Exception {
		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int sum = maxSumSubArray.findMaxSubarray(array);
		assertEquals(7, sum);
	}

}
