package com.deepak.coreman.ch1;

public class InsertionSort {

	private BinarySerach binarySerach = new BinarySerach();

	public void sort(int[] array) {
		for (int j = 1; j < array.length; j++) {
			System.out.println(j);
			int i = j - 1;
			int key = array[j];
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				array[i] = key;
				i--;
			}
			array[i + 1] = key;
		}
	}

	public void recursive(int[] array) {
		sortRecursive(array, 0, array.length - 1);
	}

	private void sortRecursive(int[] array, int i, int j) {
		if (i >= j)
			return;
		sortRecursive(array, i, j - 1);
		insert(array, i, j);

	}

	private void insert(int[] array, int i, int j) {
		int key = array[j];
		int k = j - 1;
		while (k >= 0 && array[k] > key) {
			array[k + 1] = array[k];
			array[k] = key;
			k--;
		}
		array[k + 1] = key;
	}

	public void sortWithBSearch(int[] array) {
		for (int j = 1; j < array.length; j++) {
			System.out.println(j);
			int i = j - 1;
			int key = array[j];
			int pos = binarySerach.search(array, 0, i, key);
			while (i >= pos ) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}
}
