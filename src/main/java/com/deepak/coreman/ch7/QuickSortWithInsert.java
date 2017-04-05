package com.deepak.coreman.ch7;

import java.util.Random;

public class QuickSortWithInsert {

	public void sort(int[] a, int k) {
		sort(a, 0, a.length - 1, k);
		insertSort(a);

	}

	private void insertSort(int[] a) {
		for (int j = 1; j < a.length; j++) {
			int i = j - 1;
			int key = a[j];
			while (i >= 0 && a[i] > key) {
				a[i + 1] = a[i];
				a[i] = key;
				i--;
			}
			a[i+1]=key;
		}

	}

	public void sort(int[] a, int p, int r, int k) {
		if (((r - p) + 1) > k && (p < r)) {
			Random random = new Random();
			int index = random.nextInt(r - p) + p;
			swap(a, index, r);
			int q = partition(a, p, r);
			sort(a, p, q - 1, k);
			sort(a, q + 1, r, k);
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
