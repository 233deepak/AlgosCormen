package com.deepak.coreman.ch15;

public class MinCostPathFinder {

	private int[][] cost;

	public int optimalPath(int i, int j) {
		return findOptimal(i, j);
	}

	private int findOptimal(int dx, int dy) {
		if (dx < 0 || dy < 0) {
		    return Integer.MAX_VALUE;
		}
		if (dx == 0 && dy == 0)
			return cost[dx][dy];
		return cost[dx][dy]
				+ min(findOptimal(dx - 1, dy), findOptimal(dx, dy - 1),
						findOptimal(dx - 1, dy - 1));
	}

	private int min(int i, int j, int k) {
		int temp = (i < j) ? i : j;
		return (k < temp) ? k : temp;

	}

	public void setCost(int[][] cost) {
		this.cost = cost;
	}

}
