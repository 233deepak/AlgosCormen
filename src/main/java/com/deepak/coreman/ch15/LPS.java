package com.deepak.coreman.ch15;

public class LPS {

	public int findLPS(String word) {
		if (word.length() == 1)
			return 1;
		if (word.charAt(0) == word.charAt(1))
			return 2;
		return LPS(word, 0, word.length() - 1);
	}

	private int LPS(String word, int i, int j) {
		if (i == j)
			return 1;
		if (word.charAt(i) == word.charAt(j))
			return 2 + LPS(word, i + 1, j - 1);
		else
			return max(LPS(word, i + 1, j), LPS(word, i, j - 1));
	}

	private int max(int i, int j) {

		return (i > j) ? i : j;
	}

}
