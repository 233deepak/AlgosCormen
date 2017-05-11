package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLPS {
	
	private LPS lps =new LPS();
	
	@Test
	public void LSPSOfStringlength1() throws Exception {
		int length=lps.findLPS("A");
		assertEquals(1, length);
		
	}
	
	@Test
	public void lpsWith2Character() throws Exception {
		int length=lps.findLPS("AA");
		assertEquals(2, length);
	}
	
	@Test
	public void lpsWith2DiffCharacter() throws Exception {
		int length=lps.findLPS("AB");
		assertEquals(1, length);
	}
	
	@Test
	public void lpsWithMoreDiffCharacter() throws Exception {
		int length=lps.findLPS("CIVIC");
		assertEquals(5, length);
	}
	
	@Test
	public void lpsWithMoreCharacter() throws Exception {
		int length=lps.findLPS("racecar");
		assertEquals(7, length);
	}
	
	@Test
	public void lpsWithNotPallindrome() throws Exception {
		int length=lps.findLPS("character");
		assertEquals(5, length);
	}

}
