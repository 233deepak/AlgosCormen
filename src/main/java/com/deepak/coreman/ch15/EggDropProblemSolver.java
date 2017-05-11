package com.deepak.coreman.ch15;

import java.util.Scanner;

public class EggDropProblemSolver {

	int cost[][];

	public int drop(int n, int k) {
		cost = new int[n + 1][k + 1];
		for (int i = 0; i < n + 1; i++)
			for (int j = 0; j < k + 1; j++)
				cost[i][j] = -1;
		return dropEgg(n, k);
	}

	public int dropEgg(int n, int k) {
		if (k == 0 || k == 1)
			return k;
		if (n == 1)
			return k;
		if (cost[n][k] != -1)
			return cost[n][k];

		int min = Integer.MAX_VALUE;
		for (int i = 1; i <= k; i++) {
			int max = max(1 + dropEgg(n - 1, i - 1), 1 + dropEgg(n, k - i));
			if (max < min)
				min = max;
		}
		cost[n][k] = min;
		return min;
	}

	private int max(int i, int j) {
		return (i > j) ? i : j;
	}
	
	
	private void dropEgg() {
		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int k = sc.nextInt();
			// Compute and print result
			System.out.println(drop(n, k));

			t--;
		}

	}
	
	public static void main(String[] args) {
		new EggDropProblemSolver().dropEgg();
	}

}
