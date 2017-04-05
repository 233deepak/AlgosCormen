package com.deepak.coreman.ch1;

public class Sumfinder {

	private MergeSort mergeSort = new MergeSort();

	public void findNumberWithSum(int[] array, int sum) {
		mergeSort.sort(array);
		int l = 0, r = array.length - 1;
		while (l < r) {
			int tempSum = array[l] + array[r];
			if (tempSum == sum) {
				System.out.println("Numbers are :" + array[l] + "," + array[r]);
				break;
			}
			if (tempSum > sum)
				r--;
			else
				l++;
		}

		System.out.println("No numbers found");
	}
}
