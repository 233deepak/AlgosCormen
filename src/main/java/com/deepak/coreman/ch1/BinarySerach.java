package com.deepak.coreman.ch1;

public class BinarySerach {

	public int search(int[] array, int ser) {
		return search(array, 0, array.length - 1, ser);
	}

	public int search(int[] array, int i, int j, int ser) {
		if (i >= j)
			return j;
		int mid = (i + j) / 2;
		if (array[mid] == ser)
			return mid;
		else if (array[mid] > ser) {
			return search(array, i, mid - 1, ser);
		} else {
			return search(array, mid + 1, j, ser);
		}
	}
}
