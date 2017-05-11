package com.deepak.coreman.ch15;

import java.util.Scanner;

public class LISubSequence {

	int[][] memory;
	int[] maxArray;

	public int findLIS(int[] array) {

		memory = new int[1][array.length];
		maxArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			memory[0][i] = -1;
		}
		int length = lis(array, 0, array.length - 1);
		return length;
	}

	private int lis(int[] array, int i, int j) {
		if (i == j)
			return 1;
		if (memory[i][j] != -1) {
			return memory[i][j];
		}
		int max = Integer.MIN_VALUE;
		for (int k = 0; k < j; k++) {
			int length = 0;
			if (array[k] < array[j]) {
				length = 1 + lis(array, i, k);
			}
			if (length > max) {
				max = length;
			}
		}
		memory[i][j] = max;
		maxArray[j] = max;
		return max;
	}

	public void findLis(String[] args) {

		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		// One by one run for all input test cases
		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int[] arr = new int[n];
			// Input the array
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			// Input the element to be searched

			// Compute and print result
			System.out.println(findLIS(arr));

			t--;
		}
	}

	public int findLISBottomUp(int[] array) {
		int[] list = new int[array.length];
		for (int i = 0; i < list.length; i++) {
			list[i] = 1;
		}

		for (int i = 1; i <= array.length - 1; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] > array[j] && (list[j] + 1 > list[i])) {
					list[i] = list[j] + 1;
				}
			}
		}
		int max = list[0];
		for (int i = 0; i < list.length; i++)
			if (list[i] > max)
				max = list[i];
		return max;
	}

}
