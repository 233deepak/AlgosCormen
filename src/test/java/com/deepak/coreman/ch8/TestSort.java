package com.deepak.coreman.ch8;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestSort {

	private CountingSort countingSort;

	@Before
	public void init() {
		countingSort = new CountingSort();
	}

	@Test
	public void testSort() {
		int[] array = { 2, 5, 3, 0, 2, 3, 0, 3 };
		int[] sorted = { 0, 0, 0, 0, 0, 0, 0, 0 };

		countingSort.sort(array, sorted, 5);
		ArrayHelper.printArray(sorted);
	}

	@Test
	public void testSort1() {
		int[] array = { 6, 0, 2, 0, 1, 3, 4, 6, 1, 3, 2 };
		int[] sorted = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		countingSort.sort(array, sorted, 6);
		ArrayHelper.printArray(sorted);
	}
	
	@Test
	public void testCount() {
		int[] array = { 6, 0, 2, 0, 1, 3, 4, 6, 1, 3, 2 };
		System.out.println(countingSort.count(array, 6, 0, 3));
		
	}
	
	@Test
	public void testCount2() {
		int[] array = { 6, 0, 2, 0, 1, 3, 4, 6, 1, 3, 2 };
		System.out.println(countingSort.count(array, 6, 2, 6));
		
	}

}
