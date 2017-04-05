package com.deepak.coreman.ch8;

public class AvrageSorting {

	public void sort(int[] array, int k) {

		for (int i = 0; i <array.length - k ; i++) {
			if (array[i] > array[i + k]) {
				int temp = array[i];
				array[i] = array[i + k];
				array[i + k] = temp;
				ensureProperty(array, i, k);
			}

		}

	}

	private void ensureProperty(int[] array, int i, int k) {
		while ((i - k) > 0) {
			if (array[i - k] > array[i]) {
				int temp = array[i];
				array[i] = array[i - k];
				array[i - k] = temp;
				i-=k;
			}
		}
	}
}
