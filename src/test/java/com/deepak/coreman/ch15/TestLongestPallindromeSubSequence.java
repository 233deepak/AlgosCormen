package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLongestPallindromeSubSequence {

	private LPSFinder lpsFinder;

	@Before
	public void setup() {
		lpsFinder = new LPSFinder();
	}

	@Test
	public void stringWithEmptyCharacter() throws Exception {
		String text = "";
		int maxLength = lpsFinder.maxPallindromeLenght(text);
		assertEquals(0, maxLength);
	}

	@Test
	public void stringWithSingleCharacter() throws Exception {
		String text = "a";
		int maxLength = lpsFinder.maxPallindromeLenght(text);
		assertEquals(1, maxLength);
	}

	@Test
	public void stringWithMoreCharacter() throws Exception {
		String text = "aaaabbaa";
		int maxLength = lpsFinder.maxPallindromeLenght(text);
		assertEquals(4, maxLength);
	}
	
	@Test
	public void stringWithLargeCharacter() throws Exception {
		String text = "forgeeksskeegfor";
		int maxLength = lpsFinder.maxPallindromeLenght(text);
		assertEquals(10, maxLength);
	}
	
	@Test
	public void stringWithOddCharacters() throws Exception {
		String text = "bbabb";
		int maxLength = lpsFinder.maxPallindromeLenght(text);
		assertEquals(5, maxLength);
	}
}
