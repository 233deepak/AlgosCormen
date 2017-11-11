package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCountNDigitNonDecreasing {

	private CalculateNonDecresing calculateNonDecresing;

	@Before
	public void setup() {
		calculateNonDecresing = new CalculateNonDecresing();
	}

	@Test
	public void nonDecresing0digit() throws Exception {
		int count = calculateNonDecresing.count(0);
		assertEquals(0, count);
	}

	@Test
	public void nonDecresing1digit() throws Exception {
		int count = calculateNonDecresing.count(1);
		assertEquals(10, count);
	}
	
	@Test
	public void nonDecresing2digit() throws Exception {
		int count = calculateNonDecresing.count(2);
		assertEquals(55, count);
	}
	
	@Test
	public void nonDecresing3digit() throws Exception {
		int count = calculateNonDecresing.count(3);
		assertEquals(220, count);
	}
}
