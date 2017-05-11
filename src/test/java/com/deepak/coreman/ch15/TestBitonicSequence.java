package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBitonicSequence {
	private BitonicSequenceFinder bitonicSequence;

	@Before
	public void setup() {
		bitonicSequence = new BitonicSequenceFinder();
	}

	@Test
	public void increasing() throws Exception {
		int[] array = { 1, 11, 2 };
		int[] increasing = bitonicSequence.findIncreasingSequence(array);
		assertArrayEquals(new int[] { 1, 2, 2 }, increasing);
	}

	@Test
	public void increasingWithLength6() throws Exception {
		int[] array = { 1, 11, 2, 10, 4, 5, 2, 1 };
		int[] increasing = bitonicSequence.findIncreasingSequence(array);
		assertArrayEquals(new int[] { 1, 2, 2, 3, 3, 4, 2, 1 }, increasing);
	}

	@Test
	public void increasingWithLength4() throws Exception {
		int[] array = { 2, -1, 4, 3, 5, -1, 3, 2 };
		int[] increasing = bitonicSequence.findIncreasingSequence(array);
		assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 1, 2, 2 }, increasing);
	}

	@Test
	public void decreasing() throws Exception {
		int[] array = { 1, 11, 2 };
		int[] increasing = bitonicSequence.findDecreasingSequence(array);
		assertArrayEquals(new int[] { 1, 1, 2 }, increasing);
	}

	@Test
	public void decreasingLength6() throws Exception {
		int[] array = { 1, 11, 2, 10, 4, 5, 2, 1 };
		int[] increasing = bitonicSequence.findDecreasingSequence(array);
		assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 3, 4, 5 }, increasing);
	}

	@Test
	public void decreasingWithLength4() throws Exception {
		int[] array = { 2, -1, 4, 3, 5, -1, 3, 2 };
		int[] increasing = bitonicSequence.findDecreasingSequence(array);
		assertArrayEquals(new int[] { 1, 2, 1, 2, 1, 3, 2, 3 }, increasing);
	}
	
	@Test
	public void bitonicSequencneLength() throws Exception {
		int[] array = { 1, 11, 2, 10, 4, 5, 2, 1 };
		int maxBitonic = bitonicSequence.bitonicSequence(array);
		assertEquals(6, maxBitonic);
		
	}

}
