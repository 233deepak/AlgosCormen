package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestStairClimbing {

	private StairClimber stairClimber;
	
	@Before
	public void setup(){
		stairClimber = new StairClimber();
	}

	@Test
	public void oneStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(1);
		assertEquals(1, ways);

	}
	

	@Test
	public void twoStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(2);
		assertEquals(2, ways);
	}
	
	@Test
	public void threeStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(3);
		assertEquals(3, ways);
	}
	
	@Test
	public void fourStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(4);
		assertEquals(5, ways);
	}
	
	@Test
	public void fiveStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(5);
		assertEquals(8, ways);
	}
	
	@Test
	public void tenStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(10);
		assertEquals(89, ways);
	}

	@Test
	public void twentyFourStair() throws Exception {
		int ways = stairClimber.clalculateAllWay(24);
		assertEquals(75025, ways);
	}
	
	@Test @Ignore
	public void Four100Stair() throws Exception {
		int ways = stairClimber.clalculateAllWay(100);
		assertEquals(75025, ways);
	}
}
