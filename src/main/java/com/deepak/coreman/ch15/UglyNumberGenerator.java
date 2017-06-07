package com.deepak.coreman.ch15;

public class UglyNumberGenerator {

	public int[] generateUgly(int i) {
		int[] array = new int[i];
		array[0] = 1;
		min(array, i);
		return array;
	}

	private void min(int[] array, int i) {
		int i1 = 0, i2 = 0, i3 = 0;
		int min = 0;
		for (int index = 1; index < i; index++) {
			int p1 = array[i1] * 2;
			int p2 = array[i2] * 3;
			int p3 = array[i3] * 5;
			if (p1 < p2 && p1 < p3) {
				min = p1;
				i1++;
			} else if (p2 < p3 && p2 < p1) {
				min = p2;
				i2++;
			} else if (p3 < p1 && p3 < p2) {
				min = p3;
				i3++;
			}
			array[index] = min;

		}
	}

}
