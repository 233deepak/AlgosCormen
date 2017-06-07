package com.deepak.coreman.ch15;

public class LPSFinder {

	public int maxPallindromeLenght(String text) {
		if (text.length() == 0)
			return 0;
		return findMax(text, 0, text.length() - 1);
	}

	private int findMax(String text, int i, int j) {
		if (i == j) {
			return 1;
		}
		int mid = (i + j) / 2;
		int left = findMax(text, i, mid);
		int right = findMax(text, mid + 1, j);
		int merge = merge(text, i, mid, j);
		return max(left, right, merge);
	}

	private int max(int left, int right, int merge) {
		int temp = (left > right) ? left : right;
		return (temp > merge) ? temp : merge;
	}

	private int merge(String text, int i, int mid, int j) {
		int maxLength = 0;
		if ((j - i + 1) % 2 == 0) {
			maxLength = compare(text, i, mid, mid + 1, j);
		} else {
			maxLength = compare(text, i, mid - 1, mid + 1, j) + 1;
		}
		return maxLength;
	}

	private int compare(String text, int i, int leftIndex, int rightIndex, int j) {
		int length = 0;
		while (leftIndex >= i && rightIndex <= j) {
			if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
				return length;
			}
			length += 2;
			leftIndex--;
			rightIndex++;
		}

		return length;
	}

}
