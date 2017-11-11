package com.deepak.coreman.ch15;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCountAllNoSumToGivenNumber {

	private GivenSumFinder givenSumFinder;

	@Before
	public void setUp() {
		givenSumFinder = new GivenSumFinder();
	}

	@Test
	public void oneDigitNumberSumTo1() throws Exception {
		int count = givenSumFinder.countAllNumber(1, 1);
		assertEquals(1, count);
	}

	@Test
	public void oneDigitNumberSumTo2() throws Exception {
		int count = givenSumFinder.countAllNumber(1, 2);
		assertEquals(1, count);
	}

	@Test
	public void oneDigitNumberSumTo11() throws Exception {
		int count = givenSumFinder.countAllNumber(1, 11);
		assertEquals(-1, count);
	}

	@Test
	public void twoDigitNumberSumTo2() throws Exception {
		int count = givenSumFinder.countAllNumber(2, 2);
		assertEquals(2, count);
	}

	@Test
	public void twoDigitNumberSumTo5() throws Exception {
		int count = givenSumFinder.countAllNumber(2, 5);
		assertEquals(5, count);
	}

	@Test
	public void threeDigitNumberSumTo6() throws Exception {
		int count = givenSumFinder.countAllNumber(3, 6);
		assertEquals(21, count);
	}

	@Test
	public void sumWhichIsNotPossible() throws Exception {
		int count = givenSumFinder.countAllNumber(2, 100);
		assertEquals(-1,count);
	}
	
	@Test
	public void sumWhichIsNotPossible2() throws Exception {
		int count = givenSumFinder.countAllNumber(84, 100);
		assertEquals(-1,count); 	
	}
	
	@Test
	public void sumWhichIsNotPossiblelarge() throws Exception {
		int count = givenSumFinder.countAllNumber(75, 22);
		assertEquals(-1,count); 	
	}
}
