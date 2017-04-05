package com.deepak.coreman.ch9;

public class SecondMinFinder {

	public int findMin(int[] array) {
		return findSmallest(array, 0, array.length - 1);

	}

	private int findSmallest(int[] array, int i, int j) {
		if (array.length == 2) {
			return (array[0] > array[1]) ? array[0] : array[1];
		}

		int[] a = new int[array.length / 2];
		int k = 0;
		for (int index = 0; index < array.length; index += 2) {
			a[k++] = (array[index] < array[index + 1]) ? array[index]
					: array[index + 1];
		}
		return findSmallest(a, 0, a.length - 1);
	}
}
