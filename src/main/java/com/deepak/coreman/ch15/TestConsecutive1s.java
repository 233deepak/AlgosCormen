package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestConsecutive1s {

	private BinaryStringCounter counter;

	@Before
	public void setup() {
		counter = new BinaryStringCounter();
	}

	@Test
	public void countNoConsecutive1StringOfLength1() throws Exception {
		int count = counter.countNonConsecutiveOneString(1);
		assertEquals(2, count);
	}
	

	@Test
	public void countNoConsecutive1StringOfLength2() throws Exception {
		int count = counter.countNonConsecutiveOneString(2);
		assertEquals(3, count);
	}
	
	@Test
	public void countNoConsecutive1StringOfLength3() throws Exception {
		int count = counter.countNonConsecutiveOneString(3);
		assertEquals(5, count);
	}
	
	@Test
	public void countNoConsecutive1StringOfLength4() throws Exception {
		int count = counter.countNonConsecutiveOneString(4);
		assertEquals(8, count);
	}

}
