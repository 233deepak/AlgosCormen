package com.deepak.coreman.ch9;

import java.util.Random;

public class RandomSelect {

	private Random random;

	public RandomSelect() {
		random = new Random();
	}

	public int selectRandom(int array[], int i) {
		return randomSelect(array, 0, array.length - 1, i);

	}

	private int randomSelect(int[] array, int p, int r, int i) {
		if (p == r)
			return array[p];
		int q = randomPartion(array, p, r);
		int k = q - p + 1;
		if (k == i)
			return array[q];
		if (k > i)
			return randomSelect(array, p, q - 1, i);
		else
			return randomSelect(array, q + 1, r, i - k);

	}

	private int randomPartion(int[] array, int p, int r) {
		int index = random.nextInt(r - p) + p;
		swap(array, index, r);
		int x = array[r];
		int i = p - 1;
		for (int j = p; j < r - 1; j++) {
			if (array[j] <= x) {
				i++;
				swap(array, j, i);
			}
		}
		i++;
		swap(array, i, r);
		return i;
	}

	private void swap(int[] array, int index, int p) {
		int temp = array[index];
		array[index] = array[p];
		array[p] = temp;

	}

}
