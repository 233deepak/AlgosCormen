package com.deepak.coreman.ch15;

import java.util.Scanner;

public class GivenSumFinder {

	private int memory[][];

	public int countAllNumber(int n, int sum) {

		memory = new int[n + 1][sum + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= sum; j++)
				memory[i][j] = -1;
		}
		int count = count(n, sum);
		return count;
	}

	private int count(int n, int sum) {
		if (sum <= 0)
			return 0;
		if (n == 1 && (sum >= 0 && sum <= 9))
			return 1;
		else if (n == 1)
			return -1;
		if (memory[n][sum] != -1)
			return memory[n][sum];

		int count = 0;
		for (int i = 0; i <= 9; i++) {
			count += count(n - 1, sum - i);
		}
		memory[n][sum] = count;
		return count;
	}

	public void count(String[] args) {

		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		// One by one run for all input test cases
		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int sum = sc.nextInt();
			// Input the array

			// Input the element to be searched

			// Compute and print result
			System.out.println(countAllNumber(n, sum));

			t--;
		}
	}
	
	public static void main(String[] args) {
		new GivenSumFinder().count(args);
	}
}
