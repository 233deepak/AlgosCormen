package com.deepak.coreman.ch9;

public class MaxMinFinder {

	public void findMaxMin(int[] array) {
		int gMax = 0, gMin = 0;
		int index = 0;
		if (array.length % 2 == 0) {
			if (array[0] > array[1]) {
				gMax = array[0];
				gMin = array[1];
			} else {
				gMax = array[1];
				gMin = array[0];
			}
			index = 2;
		} else {
			gMax = gMin = array[0];
			index = 1;
		}
		for (; index < array.length - 1; index+=2) {
			int max, min;
			if (array[index] > array[index + 1]) {
				max = array[index];
				min = array[index + 1];
			} else {
				max = array[index + 1];
				min = array[index];
			}

			gMax = (max > gMax) ? max : gMax;
			gMin = (min < gMin) ? min : gMin;
		}

		System.out.println("Max = " + gMax + ", Min=" + gMin);

	}
}
