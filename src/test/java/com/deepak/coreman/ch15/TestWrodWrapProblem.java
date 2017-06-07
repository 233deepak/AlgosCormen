package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestWrodWrapProblem {

	private WordWrapper wordWrapper;

	@Before
	public void setup() {
		wordWrapper = new WordWrapper();
	}

	@Test
	public void wrapOnlyOneWord() throws Exception {
		int width = 10;
		String line = "Geeks";
		int minCost = wordWrapper.wrapWord(line);
		assertEquals(0, minCost);
	}

	@Test
	public void testName() throws Exception {
		int width = 10;
		String line = "Geeks for";
		wordWrapper.setWidth(width);
		int minCost = wordWrapper.wrapWord(line);
		assertEquals(1, minCost);
	}
	
	@Test
	public void testName3Words() throws Exception {
		int width = 10;
		String line = "Geeks for Geeks";
		wordWrapper.setWidth(width);
		int minCost = wordWrapper.wrapWord(line);
		assertEquals(2, minCost);
	}
	
	@Test
	public void testName7Words() throws Exception {
		int width = 10;
		String line = "Geeks for Geeks presents word wrap problem";
		wordWrapper.setWidth(width);
		int minCost = wordWrapper.wrapWord(line);
		assertEquals(13, minCost);
	}

}
