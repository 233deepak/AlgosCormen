package com.deepak.coreman.ch6;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestMaxHeap {

	private MaxHeapBuilder heapBuilder;

	@Before
	public void init() {
		heapBuilder = new MaxHeapBuilder();
	}

	@Test
	public void testHeapify() {
		int[] array = { 16, 4, 10, 14, 7, 9, 3, 2, 8, 1 };
		heapBuilder.maxHeapify(array, 1);
		ArrayHelper.printArray(array);

	}

	@Test
	public void testHeapify2() {
		int[] array = { 27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0 };
		heapBuilder.maxHeapify(array, 2);
		ArrayHelper.printArray(array);

	}

	@Test
	public void testBuildHeap() {
		int[] array = { 4, 1, 3, 2, 16, 9, 10, 14, 8, 7 };
		heapBuilder.buildMaxHeap(array);
		ArrayHelper.printArray(array);

	}

}
