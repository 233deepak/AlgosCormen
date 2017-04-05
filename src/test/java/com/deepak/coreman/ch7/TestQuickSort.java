package com.deepak.coreman.ch7;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestQuickSort {

	private QuickSort quickSort;
	private RanomizeQuickSort randomizeSort;
	private QuickSortWithInsert quickSortInsert;

	@Before
	public void init() {
		quickSort = new QuickSort();
		randomizeSort = new RanomizeQuickSort();
		quickSortInsert = new QuickSortWithInsert();

	}

	@Test
	public void testSort1() {
		int[] array = { 2, 8, 7, 1, 3, 5, 6 };
		quickSort.sort(array, 0, array.length - 1);
		ArrayHelper.printArray(array);

	}

	@Test
	public void testSort2() {
		int[] array = { 13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11 };
		quickSort.sort(array, 0, array.length - 1);
		ArrayHelper.printArray(array);

	}

	@Test
	public void testRandomSort1() {
		int[] array = { 2, 8, 7, 1, 3, 5, 6 };
		randomizeSort.sort(array, 0, array.length - 1);
		ArrayHelper.printArray(array);

	}

	@Test
	public void testRandomSort2() {
		int[] array = { 13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11 };
		quickSort.sort(array, 0, array.length - 1);
		ArrayHelper.printArray(array);

	}

	@Test
	public void testInsertSort2() {
		int[] array = { 13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11 };
		quickSortInsert.sort(array,3);
		ArrayHelper.printArray(array);

	}

}
