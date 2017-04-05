package com.deepak.coreman.ch1;

import java.util.Random;

import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestMergeSort {

	private MergeSort mergeSort = new MergeSort();

	@Test
	public void testCase1() {
		int[] array = { 5, 2, 4, 6, 1, 3 };
		mergeSort.sort(array);
		ArrayHelper.printArray(array);
	}

	@Test
	public void testCase2() {
		int[] array = { 5, 2, 4, 7, 1, 3, 2, 6 };
		mergeSort.sort(array);
		ArrayHelper.printArray(array);
	}

	@Test
	public void testCase2LargeNumbers() {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt(100);
		}
		mergeSort.sort(array);
	 ArrayHelper.printArray(array);
	}

	@Test
	public void testCase2bestCase() {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = i;
		}
		mergeSort.sort(array);
		ArrayHelper.printArray(array);
	}

	@Test
	public void testCaseWorstCase() {
		int[] array = new int[100000];
		int k = 0;
		for (int i = 100000 - 1; i > 0; i--) {
			array[k++] = i;
		}
		mergeSort.sort(array);
		ArrayHelper.printArray(array);
	}

}
