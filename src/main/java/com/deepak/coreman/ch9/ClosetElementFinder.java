package com.deepak.coreman.ch9;

import java.util.Random;

public class ClosetElementFinder {

	private Random random;

	public ClosetElementFinder() {
		random = new Random();
	}

	public void findClosetToMedian(int[] array, int k) {

		int median = findElementWithrank(array, (array.length) / 2);
		int[] distance = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			distance[index] = Math.abs(array[index] - median);
		}
		int requiredDistance = findElementWithrank(distance, k);
		for (int index = 0; index < array.length; index++) {
			if (array[index]-median <= requiredDistance) {
				System.out.println(array[index]);
			}

		}

	}

	private int findElementWithrank(int[] array, int rank) {
		return findElementWithrank(array, rank, 0, array.length - 1);
	}

	private int findElementWithrank(int[] array, int rank, int p, int r) {
		if (p == r) {
			return array[p];
		}
		int q = select(array, rank, p, r);
		int k = q - p + 1;
		if (rank == k)
			return array[q];
		if (rank < k)
			return findElementWithrank(array, rank, p, q - 1);
		return findElementWithrank(array, rank - k, q + 1, r);

	}

	private int select(int[] array, int rank, int p, int r) {
		int index = random.nextInt(r - p) + p;
		swap(array, index, r);
		int i = p - 1;
 		int x = array[r];
		for (int j = p; j <= r - 1; j++) {
			if (array[j] <= x) {
				i++;
				swap(array, i, j);
			}
		}
		i++;
		swap(array, i, r);
		return i;
	}

	private void swap(int[] array, int index, int r) {
		int temp = array[index];
		array[index] = array[r];
		array[r] = temp;

	}
}
