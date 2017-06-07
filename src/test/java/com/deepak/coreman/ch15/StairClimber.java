package com.deepak.coreman.ch15;

public class StairClimber {

	int memory[];

	public int clalculateAllWay(int noOfStairs) {

		memory = new int[noOfStairs+1];
		return calculate(noOfStairs);
	}

	private int calculate(int noOfStairs) {
		if (noOfStairs == 1 || noOfStairs == 0)
			return 1;
		if (memory[noOfStairs] != 0) {
			return memory[noOfStairs];
		}
		int noOfWays = calculate(noOfStairs - 2) + calculate(noOfStairs - 1);
		memory[noOfStairs] = noOfWays;
		return noOfWays;
	}

}
