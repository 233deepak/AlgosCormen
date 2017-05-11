package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPallindromePartition {

	private PallindromePartitioner pallindrome;

	@Before
	public void setup() {
		pallindrome = new PallindromePartitioner();
	}

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void partionStringWithlength1() throws Exception {
		int noOfCuts = pallindrome.partition("a");
		assertEquals(1, noOfCuts);
	}
	
	@Test
	public void partionStringWithlength0() throws Exception {
		int noOfCuts = pallindrome.partition("");
		assertEquals(0, noOfCuts);
	}
	
	@Test
	public void partionPallindromeString() throws Exception {
		int noOfCuts = pallindrome.partition("aba");
		assertEquals(0, noOfCuts);
	}
	
	@Test
	public void partionNonPallindromeString() throws Exception {
		int noOfCuts = pallindrome.partition("abab");
		assertEquals(1, noOfCuts);
	}
	
	@Test
	public void partionNonPallindromeString2() throws Exception {
		int noOfCuts = pallindrome.partition("ababbbabbababa");
		assertEquals(3, noOfCuts);
	}

}
