package com.deepak.coreman.ch15;

public class Squares {

	private int[] memory;

	public int getMinNoOfSquareFor(int n) {
		memory = new int[n + 1];
		for (int i = 0; i < n + 1; i++)
			memory[i] = -1;
		return findCount(n);
	}

	private int findCount(int n) {
		if (n == 1)
			return 1;
		int x = 1;
		if (memory[n] != -1)
			return memory[n];

		int square, min = Integer.MAX_VALUE;
		while (true) {
			square = (x * x);
			if (square > n)
				break;
			int count = findCount(n - square);
			if (count < min)
				min = count;
			x++;
		}
		int count = 1 + min;
		memory[n] = count;
		return count;
	}
}
