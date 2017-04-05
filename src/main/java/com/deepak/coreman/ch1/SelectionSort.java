package com.deepak.coreman.ch1;

public class SelectionSort {

	public void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
			int j = findMin(i, array);
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
	}

	private int findMin(int i, int[] array) {
		int min = array[i], pos = i;
		for (int j = i + 1; j < array.length; j++) {
			if (array[j] < min) {
				min = array[j];
				pos = j;
			}

		}
		return pos;
	}

}
