package com.deepak.coreman.ch6;

public class MaxHeapBuilder {

	public void maxHeapify(int[] array, int index) {

		if (index > (array.length) / 2)
			return;
		int left = (2 * index) + 1;
		int right = (2 * index) + 2;
		if (right >= array.length) {
			if (array[left] > array[index]) {
				int temp = array[index];
				array[index] = array[left];
				array[left] = temp;
			}
			return;
		}
		if (array[index] < array[left] || array[index] < array[right]) {
			int max = (array[left] > array[right]) ? left : right;
			int temp = array[index];
			array[index] = array[max];
			array[max] = temp;
			maxHeapify(array, max);
		}
	}

	public void buildMaxHeap(int[] array) {
		for (int i = ((array.length) - 1) / 2; i >= 0; i--) {
			maxHeapify(array, i);
		}

	}

}
