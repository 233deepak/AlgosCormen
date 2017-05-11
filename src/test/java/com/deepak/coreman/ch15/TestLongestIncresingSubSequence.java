package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLongestIncresingSubSequence {

	private LISubSequence subSequence;

	@Before
	public void setup() {
		subSequence = new LISubSequence();
	}

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void LISOfOnElement() throws Exception {
		int array[] = { 3 };
		int length = subSequence.findLIS(array);
		assertEquals(length, 1);
	}

	@Test
	public void LISOfMoreElement() throws Exception {
		int array[] = { 3, 10, 2, 1, 20 };
		int length = subSequence.findLIS(array);
		assertEquals(length, 3);
	}

	@Test
	public void LISOfMoreElement2() throws Exception {
		int array[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int length = subSequence.findLIS(array);
		assertEquals(6, length);
	}
	
	@Test
	public void LISOfMoreElementBottomUp() throws Exception {
		int array[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		int length = subSequence.findLISBottomUp(array);
		assertEquals(6, length);
	}

	@Test
	public void LISOfMoreElement22() throws Exception {
		int array[] = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		int length = subSequence.findLIS(array);
		assertEquals(6, length);
	}

	@Test
	public void LISOfMoreElement3() throws Exception {
		int array[] = { 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82 };
		int length = subSequence.findLIS(array);
		assertEquals(6, length);
	}

	/*
	 * public static void main(String[] args) { new
	 * LISubSequence().findLis(args); }
	 */
}
