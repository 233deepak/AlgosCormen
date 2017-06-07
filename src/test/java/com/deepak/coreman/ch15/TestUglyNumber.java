package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestUglyNumber {

	private UglyNumberGenerator uglyNumberGenerator;

	@Before
	public void setup() {
		uglyNumberGenerator = new UglyNumberGenerator();
	}

	@Test
	public void generate1UglyNumber() throws Exception {
		int[] uglyNumber = uglyNumberGenerator.generateUgly(1);
		assertArrayEquals(new int[] { 1 }, uglyNumber);
	}

	@Test
	public void generate5UglyNumber() throws Exception {
		int[] uglyNumber = uglyNumberGenerator.generateUgly(5);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, uglyNumber);
	}

}
