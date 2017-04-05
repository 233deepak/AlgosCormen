package com.deepak.coreman.ch1;

import java.util.Random;

import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestSelectionSort {

	private SelectionSort selectionSort =new SelectionSort();
	
	@Test
	public void testCase1() {
		int[] array = { 5, 2, 4, 6, 1, 3 };
		selectionSort.sort(array);
		ArrayHelper.printArray(array);
	}

	@Test
	public void testCase2LargeNumbers() {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt(100);
		}
		selectionSort.sort(array);
		ArrayHelper.printArray(array);
	}
	
	@Test
	public void testCase2bestCase() {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = i;
		}
		selectionSort.sort(array);
		ArrayHelper.printArray(array);
	}
	
	@Test
	public void testCaseWorstCase() {
		int[] array = new int[100000];
		Random random = new Random();
		int k=0;
		for (int i = 100000-1; i > 0; i--) {
			array[k++] = i;
		}
		selectionSort.sort(array);
		ArrayHelper.printArray(array);
	}
	
}
