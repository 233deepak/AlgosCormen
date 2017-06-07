package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPartiionArray {

	private PartitionArrayOnEqualSum partitioner;

	@Before
	public void setup() {
		partitioner = new PartitionArrayOnEqualSum();
	}

	@Test
	public void partitionArrayWith1Element() throws Exception {
		int[] array = { 1 };
		boolean result = partitioner.canPartition(array);
		assertEquals(false, result);
	}

	@Test
	public void partitionArrayWith4Element() throws Exception {
		int[] array = { 1, 5, 11, 5 };
		boolean result = partitioner.canPartition(array);
		assertEquals(true, result);
	}

	@Test
	public void partitionArrayWith3Element() throws Exception {
		int[] array = { 1, 5, 3 };
		boolean result = partitioner.canPartition(array);
		assertEquals(false, result);
	}

}
