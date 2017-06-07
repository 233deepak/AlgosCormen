package com.deepak.coreman.ch15;

public class OptimalSearchTree {

	private double[] p;
	private double[] q;

	public void setDummyProbabilities(double[] q) {
		this.q = q;
	}

	public void setKeyProbabilities(double[] p) {
		this.p = p;
	}

	public double findOptimalCost() {
		return findOptimalCost(1, p.length - 1);
	}

	private double findOptimalCost(int i, int j) {
		if (j == i - 1) {
			return q[j];
		}
		double min = Double.MAX_VALUE;
		for (int r = i; r <= j; r++) {
			double cost = searchCost(i, j) + findOptimalCost(i, r - 1)
					+ findOptimalCost(r + 1, j);
			if (cost < min)
				min = cost;
		}
		return min;
	}

	private double searchCost(int i, int j) {
		double cost = 0.0;
		for (int l = i; l <= j; l++) {
			cost += p[l];
		}
		for (int l = i - 1; l <= j; l++) {
			cost += q[l];
		}
		return cost;
	}

}
