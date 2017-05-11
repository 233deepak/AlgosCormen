package com.deepak.coreman.ch15;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {

	private int[][] memory;

	public int maxIncresingSequence(int[] array) {
		memory = new int[array.length + 1][array.length + 1];
		for (int i = 0; i < array.length + 1; i++)
			for (int j = 0; j < array.length + 1; j++)
				memory[i][j] = -1;
		int[] original = Arrays.copyOf(array, array.length);
		Arrays.sort(array);
		return lcs(original, array, array.length - 1, array.length - 1);
	}

	private int lcs(int[] x, int[] y, int i, int j) {
		if (i < 0 || j < 0)
			return 0;
		if(memory[i][j] !=-1){
			return memory[i][j];
		}
		if (x[i] == y[j]) {
			int value = x[i] + lcs(x, y, i - 1, j - 1);
			memory[i][j]=value;
			return value;
		} else {
			int max = max(lcs(x, y, i - 1, j), lcs(x, y, i, j - 1));
			memory[i][j]=max;
			return max;
		}
	}

	private int max(int i, int j) {
		return (i > j) ? i : j;
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
			//System.out.println(findLIS(arr));

			t--;
		}
	}

}
