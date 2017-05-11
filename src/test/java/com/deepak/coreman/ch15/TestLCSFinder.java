package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLCSFinder {

	@Test
	public void nothing() throws Exception {
		
	}
	
	@Test
	public void lcsForEmptyString() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.lcsLength("","");
		assertEquals(0, lcslength);
	}
	
	@Test
	public void lcsForSinlgeCharacterString() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.lcsLength("A","A");
		assertEquals(1, lcslength);
	}
	
	@Test
	public void lcsWithOneEmptyStringCharacterString() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.lcsLength("ABCBDAB","");
		assertEquals(0, lcslength);
	}
	
	
	@Test 
	public void lcsForMoreCharacterString() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.lcsLength("ABCBDAB","BDCABA");
		assertEquals(4, lcslength);
	}
	
	@Test 
	public void lcsForLongCharacterString() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.LCSTopDown("ABCBDABABCBDABABCBDABABCBDABABCBDABABCBDABABCBDAB","BDCABABDCABABDCABABDCABABDCABABDCABABDCABABDCABABDCABABDCABA");
		assertEquals(40, lcslength);
	}
	
	@Test
	public void topDownApproach(){
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.LCSTopDown("ABCBDAB","BDCABA");
		assertEquals(4, lcslength);
	}
	
	@Test
	public void getLCSString() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.LCSTopDown("ABCBDAB","BDCABA");
		String lcsString = lcsFinder.getLCSString();
		assertEquals("ABCB", lcsString);
	}
	
	@Test
	public void getLCSStringTwo() throws Exception {
		LCSFinder lcsFinder = new LCSFinder();
		int lcslength = lcsFinder.LCSTopDown("ABC","A");
		String lcsString = lcsFinder.getLCSString();
		assertEquals("ABCB", lcsString);
	}
	
	
	
	
	
}
