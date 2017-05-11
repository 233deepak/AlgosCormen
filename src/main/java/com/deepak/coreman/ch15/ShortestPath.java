package com.deepak.coreman.ch15;

public class ShortestPath {

	private int[] nodes;
	private int[][] weights;
	private int[][] minWeights;

	public int[][] findShortestPath() {
		minWeights = new int[nodes.length][nodes.length];
		for (int i = 0; i < nodes.length; i++)
			for (int j = 0; j < nodes.length; j++)
				minWeights[i][j] = -1;
		for (int i = 0; i < nodes.length; i++) {
			for (int j = 0; j < nodes.length; j++) {
				minWeights[i][j] = findShortestPath(i, j);
			}
		}
		return minWeights;
	}

	private int findShortestPath(int i, int j) {
		if (i == j)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < nodes.length; k++) {
			if (weights[i][k] != Integer.MAX_VALUE && i!=k) {
				int weight = weights[i][k] + findShortestPath(k, j);
				if (weight < min && (weight>0))
					min = weight;
			}
		}
		return min;
	}

	public void setNodes(int[] nodes) {
		this.nodes = nodes;
	}

	public void setWeights(int[][] weights) {
		this.weights = weights;

	}

}
