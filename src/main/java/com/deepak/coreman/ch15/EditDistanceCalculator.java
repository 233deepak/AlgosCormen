package com.deepak.coreman.ch15;

import java.util.Scanner;

public class EditDistanceCalculator {

	private final int INSERT = 1;
	private final int DELETE = 1;
	private final int COPY = 0;
	private final int REPLACE = 1;

	private int[][] cost;

	public int editDistance(String x, String y) {

		cost = new int[x.length() + 1][y.length() + 1];
		for (int i = 0; i < x.length() + 1; i++) {
			for (int j = 0; j < y.length() + 1; j++)
				cost[i][j] = Integer.MAX_VALUE;
		}
		return distance(x, y, x.length() - 1, y.length() - 1);

	}

	private int distance(String x, String y, int i, int j) {
		if (i > j && j < 0)
			return DELETE + distance(x, y, i - 1, j);
		if (j < 0)
			return 0;
		if (i < 0) {
			return INSERT + distance(x, y, i, j - 1);
		}
		if (cost[i][j] != Integer.MAX_VALUE) {
			return cost[i][j];
		}
		if (x.charAt(i) == y.charAt(j)) {
			cost[i][j] = COPY + distance(x, y, i - 1, j - 1);
			return cost[i][j];
		} else {
			int min = min(REPLACE + distance(x, y, i - 1, j - 1), INSERT
					+ distance(x, y, i, j - 1),
					DELETE + distance(x, y, i - 1, j));
			cost[i][j] = min;
			return min;
		}
	}

	private int min(int i, int j, int k) {
		int temp = (i < j) ? i : j;
		return (k < temp) ? k : temp;

	}

	private void editDistance() {
		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// Input the size of the array
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			String x = sc.next();
			String y = sc.next();

			// Input the element to be searched

			// Compute and print result
			System.out.println(editDistance(x, y));

			t--;
		}

	}

	public static void main(String[] args) {
		new EditDistanceCalculator().editDistance();
	}

}
