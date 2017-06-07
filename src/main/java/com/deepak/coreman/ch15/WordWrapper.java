package com.deepak.coreman.ch15;

public class WordWrapper {

	private int width;

	public int wrapWord(String line) {
		String[] words = line.split(" ");
        if(words.length ==1)
        	return 0;
		return minSplit(words, 0);
	}

	private int minSplit(String[] words, int i) {
		if (i >= words.length-1)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int j = i + 1; j < words.length; j++) {
			int b = badness(i, j, words);
			int badness = minSplit(words, j)+b;
			if (badness < min)
				min = badness;

		}
		return min;
	}

	private int badness(int i, int j, String[] words) {
		int lengthSum = 0;
		for (int index = i; index <= j; index++)
			lengthSum += words[index].length();
		lengthSum += (j - i);
		lengthSum = width -lengthSum;
		if(lengthSum < 0)
			return Integer.MAX_VALUE;
		return lengthSum * lengthSum;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
