package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMinJumpCalculator {

	private MinJumpCalculator jumpCalculator;

	@Before
	public void setup() {
		jumpCalculator = new MinJumpCalculator();
	}

	@Test
	public void pathWitOneElement() throws Exception {
		int[] array = { 1 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumps();
		assertEquals(1, minJumps);
	}

	@Test
	public void pathWitAllElementsReachableFromFirst() throws Exception {
		int[] array = { 7, 5, 2, 6, 2 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumps();
		assertEquals(1, minJumps);
	}

	@Test
	public void elementsWithNoPath() throws Exception {
		int[] array = { 1, 0, 3 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumps();
		assertEquals(0, minJumps);
	}

	@Test
	public void elementsWith5Path() throws Exception {
		int[] array = { 1, 4, 3, 7, 1, 2, 6, 7, 6, 10 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumps();
		assertEquals(3, minJumps);
	}

	@Test
	public void pathWith4Element() throws Exception {
		int[] array = { 1, 5, 2, 3 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumps();
		assertEquals(2, minJumps);
	}

	@Test
	public void pathWith4ElementDP() throws Exception {
		int[] array = { 1, 5, 2, 3 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumpsWithDP();
		assertEquals(2, minJumps);
	}
	
	@Test
	public void pathWith7ElementDP() throws Exception {
		int[] array = { 1, 4, 3, 7, 1, 2, 6, 7, 6, 10 };
		jumpCalculator.setPaths(array);
		int minJumps = jumpCalculator.getMinJumpsWithDP();
		assertEquals(3, minJumps);
	}

}
