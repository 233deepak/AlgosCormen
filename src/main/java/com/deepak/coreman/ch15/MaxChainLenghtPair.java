package com.deepak.coreman.ch15;

import java.util.Collections;
import java.util.List;

public class MaxChainLenghtPair {

	int[] maxArray;

	public int findMaxChainLength(List<Pair> pairs) {
		maxArray = new int[pairs.size()];
		for (int index = 0; index < pairs.size(); index++) {
			maxArray[index] = 1;
		}
		Collections.sort(pairs);
		return findMaxLength(pairs);
	}

	private int findMaxLength(List<Pair> pairs) {
		for (int i = 0; i < pairs.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (pairs.get(j).b < pairs.get(i).a
						&& (1 + maxArray[j]) > maxArray[i])
					maxArray[i] = (1 + maxArray[j]);
			}
		}
		return max();
	}

	private int max() {
		int max = maxArray[0];
		for (int i = 0; i < maxArray.length; i++)
			if (maxArray[i] > max)
				max = maxArray[i];
		return max;
	}
}
