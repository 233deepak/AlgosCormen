package com.deepak.coreman.ch15;

import java.util.Scanner;

public class PartitionArrayOnEqualSum {

	int[][] memory;

	public boolean canPartition(int[] array) {
		if (array.length == 1)
			return false;
		int sum = getSum(array);
		if (sum % 2 != 0)
			return false;
		int sumRequired = sum / 2;
		memory =new int[array.length][sumRequired+1];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < sumRequired + 1; j++)
				memory[i][j] = -1;
		}

		return canSplit(array, array.length - 1, sumRequired);
	}

	private boolean canSplit(int[] array, int i, int sumRequired) {
		if (sumRequired == 0)
			return true;
		if (i < 0 || sumRequired < 0)
			return false;
		if (memory[i][sumRequired] != -1)
			return (memory[i][sumRequired] == 0) ? false : true;

		boolean canSplit = canSplit(array, i - 1, sumRequired)
				|| canSplit(array, i - 1, sumRequired - array[i]);
		memory[i][sumRequired] = (canSplit) ? 1 : 0;
		return canSplit;
	}

	private int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++)
			sum += array[i];
		return sum;
	}

	private void partition() {

		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int[] arr = new int[n];
			// Input the array
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			// Input the element to be searched

			// Compute and print result
			String ans = (canPartition(arr)) ? "YES" : "NO";
			System.out.println(ans);

			t--;
		}

	}

	public static void main(String[] args) {
		new PartitionArrayOnEqualSum().partition();
	}

}
