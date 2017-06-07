package com.deepak.coreman.ch15;

import java.util.Arrays;
import java.util.Random;

public class BuildBridege {

	private int[] north;
	private int[] south;
	private Random random = new Random();
	private int[] maxArray;

	public void setNorthCoordinate(int[] north) {
		this.north = north;

	}

	public void setSouthCoordinate(int[] south) {
		this.south = south;
	}

	public int maxBridge() {
		if (north.length == 1)
			return 1;

		sortOnSouth(south, 0, south.length - 1);
		maxArray = new int[north.length];
		for (int i = 0; i < north.length; i++)
			maxArray[i] = 1;
		return lis(north);
	}

	private int lis(int[] north) {
		for (int i = 1; i < north.length; i++) {
			for (int j = 0; j < i; j++) {
				if (north[i] > north[j] && (1 + maxArray[j] > maxArray[i])) {
					maxArray[i] = 1 + maxArray[j];
				}
			}
		}
		return max(maxArray);
	}

	private int max(int[] north) {
		int max = north[0];
		for (int i = 0; i < north.length; i++)
			if (north[i] > max)
				max = north[i];
		return max;
	}

	public void sort() {
		sortOnSouth(south, 0, south.length - 1);
	}

	private void sortOnSouth(int[] south, int p, int r) {
		if (p < r) {
			int q = partition(south, p, r);
			sortOnSouth(south, p, q);
			sortOnSouth(south, q + 1, r);
		}

	}

	private int partition(int[] south, int p, int r) {
		int pivotIndex = random.nextInt(r - p) + p;
		int x = south[pivotIndex];
		int i = p - 1;
		swap(pivotIndex, r);
		for (int j = p; j <= r - 1; j++) {
			if (south[j] <= x) {
				i++;
				swap(i, j);
			}
		}

		i++;
		swap(i, r);
		return i;
	}

	private void swap(int x, int r) {
		int temp = south[x];
		south[x] = south[r];
		south[r] = temp;

		temp = north[x];
		north[x] = north[r];
		north[r] = temp;
	}
}
