package com.deepak.coreman.ch1;

public class MergeSort {

	public void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	private void sort(int[] array, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			sort(array, p, q);
			sort(array, q + 1, r);
			merge(array, p, q, r);
		}
	}

	private void merge(int[] array, int p, int q, int r) {
		int[] left = new int[q - p + 2];
		int[] right = new int[r - q + 1];
		int k = 0;
		for (int i = p; i <= q; i++)
			left[k++] = array[i];
		left[k] = Integer.MAX_VALUE;
		k = 0;
		for (int i = q + 1; i <= r; i++)
			right[k++] = array[i];
		right[k] = Integer.MAX_VALUE;
		int i = 0, j = 0;
		for (k = p; k <= r; k++) {
			if (left[i] <= right[j]) {
				array[k] = left[i++];
			} else if (right[j] < left[i]) {
				array[k] = right[j++];
			}
		}

	}

}
