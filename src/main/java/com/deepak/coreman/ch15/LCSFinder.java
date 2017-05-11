package com.deepak.coreman.ch15;

import java.util.Scanner;

public class LCSFinder {

	private int[][] cost;
	private int[][] b;
	private String x;
	private String y;

	public int lcsLength(String x, String y) {
		if (x.equals(y)) {
			return x.length();
		}

		return lcs(x, y, x.length() , y.length() );
	}

	private int lcs(String x, String y, int i, int j) {
		if (i <= 0 || j <= 0)
			return 0;
		if (x.charAt(i-1) == y.charAt(j-1)) {
			return 1 + lcs(x, y, i - 1, j - 1);
		} else {
			return max(lcs(x, y, i - 1, j), lcs(x, y, i, j - 1));
		}
	}

	private int max(int i, int j) {
		return (i > j) ? i : j;
	}

	public int LCSTopDown(String x, String y) {
		cost = new int[x.length()+1][y.length()+1];
		this.x = x;
		this.y = y;
		for (int i = 0; i <= x.length(); i++) {
			for (int j = 0; j <= y.length(); j++)
				cost[i][j] = Integer.MIN_VALUE;
		}
		return lcsTopDown(x, y, x.length(), y.length());
	}

	private int lcsTopDown(String x, String y, int i, int j) {
		if (i<=0 || j <= 0) {
			cost[i][j] = 0;
			return 0;
		}
		if (cost[i][j] != Integer.MIN_VALUE)
			return cost[i][j];
		if (x.charAt(i-1) == y.charAt(j-1)) {
			cost[i][j] = 1 + lcsTopDown(x, y, i - 1, j - 1);
		} else {
			cost[i][j] = max(lcsTopDown(x, y, i - 1, j),
					lcsTopDown(x, y, i, j - 1));
		}
		return cost[i][j];
	}

	public String getLCSString() {
		String lcs = "";
		int i = cost.length - 1;
		int j = cost[0].length - 1;
		while (i > 0 && j > 0) {
			if ((cost[i][j] == cost[i - 1][j - 1] + 1) && (x.charAt(i-1) == y.charAt(j-1)) ) {
				lcs += x.charAt(i-1);
				i=i-1;j=j-1;
			} else if (cost[i-1][j] >= cost[i][j-1]) {
				i = i - 1;
			} else {
				j = j - 1;
			}
		}
		return lcs;
	}

	public static void main(String[] args) {
		new LCSFinder().findLcs();
	}

	private void findLcs() {


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
			System.out.println(LCSTopDown(x, y));

			t--;
		}
	
		
	}
}
