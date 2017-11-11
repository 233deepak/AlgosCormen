package com.deepak.coreman.ch15;

public class RequiredSum {

	int currentSum = 1;
	int initialRequirement = 1;

	public RequiredSum(int currentSum, int initialRequirement) {
		this.currentSum = currentSum;
		this.initialRequirement = initialRequirement;
	}

	@Override
	public String toString() {
		return "RequiredSum [currentSum=" + currentSum
				+ ", initialRequirement=" + initialRequirement + "]";
	}

}
