package com.deepak.coreman.ch7;

import java.util.Random;

public class RanomizeQuickSort {

	public void sort(int[] a, int p, int r) {
		if (p < r) {
			Random random = new Random();
			int index = random.nextInt(r - p) + p;
			swap(a, index, r);
			int q = partition(a, p, r);
			sort(a, p, q - 1);
			sort(a, q + 1, r);
		}

	}

	private int partition(int[] a, int p, int r) {
		int x = a[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (a[j] <= x) {
				i++;
				swap(a, i, j);
			}
		}
		i++;
		swap(a, i, r);
		return i;
	}

	private void swap(int[] a, int index, int r) {
		int temp = a[index];
		a[index] = a[r];
		a[r] = temp;

	}

}
