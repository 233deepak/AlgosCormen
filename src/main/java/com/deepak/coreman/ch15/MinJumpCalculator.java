package com.deepak.coreman.ch15;

public class MinJumpCalculator {

	private int[] array;
	private int[] minJumpSArray;

	public void setPaths(int[] array) {
		this.array = array;
	}

	public int getMinJumps() {
		if (array.length == 1)
			return 1;
		if (array[0] > array.length)
			return 1;

		int minJumps = recursiveSol(0, array.length - 1);
		return (minJumps < 0) ? 0 : minJumps;
	}

	private int recursiveSol(int i, int j) {
		if (i > array.length)
			return Integer.MAX_VALUE - 1;
		if (reachable(i, j))
			return 1;
		int min = Integer.MAX_VALUE;
		for (int index = i + 1; index <= (i + array[i]); index++) {
			int path = 1 + recursiveSol(index, j);
			if (path < min)
				min = path;
		}
		return min;
	}

	private boolean reachable(int i, int j) {
		if ((j - i) <= array[i])
			return true;
		return false;
	}

	public int getMinJumpsWithDP() {
		minJumpSArray = new int[array.length];
		for (int i = 1; i < array.length; i++) {
			minJumpSArray[i] = Integer.MAX_VALUE;
		}
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (reachable(j, i)
						&& (1 + minJumpSArray[j]) < minJumpSArray[i]) {
					minJumpSArray[i] = 1 + minJumpSArray[j];
				}
			}
		}
		return max();
	}

	private int max() {

		return minJumpSArray[array.length - 1];
	}
}
