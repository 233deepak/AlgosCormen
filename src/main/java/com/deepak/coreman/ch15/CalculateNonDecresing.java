package com.deepak.coreman.ch15;

public class CalculateNonDecresing {

	public int count(int digit) {
		if (digit == 0)
			return 0;
		return countNo(digit);
	}

	private int countNo(int digit) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count += countNumberEndingWith(i, digit);
		}
		return count;
	}

	private int countNumberEndingWith(int i, int digit) {
		if (digit == 1)
			return 1;
		int count = 0;
		for (int j = 0; j <= i; j++)
			count += countNumberEndingWith(j, digit - 1);
		return count;
	}
}
