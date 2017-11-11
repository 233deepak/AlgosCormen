package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMinNumberOfSquareForGivenNumber {

	private Squares squares;

	@Before
	public void setup() {
		squares = new Squares();
	}

	@Test
	public void givenNoIs1() throws Exception {
		int count = squares.getMinNoOfSquareFor(1);
		assertEquals(1, count);
	}
	
	@Test
	public void givenNoIs2() throws Exception {
		int count = squares.getMinNoOfSquareFor(2);
		assertEquals(2, count);
	}
	
	@Test
	public void givenNoIs6() throws Exception {
		int count = squares.getMinNoOfSquareFor(6);
		assertEquals(3, count);
	}
	
	@Test
	public void givenNoIs100() throws Exception {
		int count = squares.getMinNoOfSquareFor(100);
		assertEquals(1, count);
	}

}
