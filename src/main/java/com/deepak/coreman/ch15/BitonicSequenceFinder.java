package com.deepak.coreman.ch15;

public class BitonicSequenceFinder {

	private int[] increasing;
	private int[] decreasing;

	public int[] findIncreasingSequence(int[] array) {
		increasing = new int[array.length];
		for (int i = 0; i < array.length; i++)
			increasing[i] = 1;
		for (int i = 1; i < array.length; i++) {
			int max = increasing[i];
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j]
						&& ((1 + increasing[j]) > increasing[i])) {
					max = (1 + increasing[j]);
					increasing[i] = max;

				}
			}
		}
		return increasing;
	}

	public int[] findDecreasingSequence(int[] array) {
		decreasing = new int[array.length];
		for (int i = 0; i < array.length; i++)
			decreasing[i] = 1;
		for (int i = 1; i < array.length; i++) {
			int max = decreasing[i];
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]
						&& ((1 + decreasing[j]) > decreasing[i])) {
					max = (1 + decreasing[j]);
					decreasing[i] = max;

				}
			}

		}
		return decreasing;
	}

	public int bitonicSequence(int[] array) {
		findIncreasingSequence(array);
		findDecreasingSequence(array);
		int[] bitonic = new int[array.length];
		for (int i = 0; i < array.length; i++)
			bitonic[i] = increasing[i] + decreasing[i] - 1;
		int max = bitonic[0];
		for (int i = 0; i < array.length; i++) {
			if (bitonic[i] > max)
				max = bitonic[i];
		}

		return max;
	}
}
