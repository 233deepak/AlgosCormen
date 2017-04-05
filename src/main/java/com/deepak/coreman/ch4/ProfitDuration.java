package com.deepak.coreman.ch4;

public class ProfitDuration {

	int high;
	int low;
	int profit;

	public ProfitDuration(int low, int high, int profit) {
		super();
		this.high = high;
		this.low = low;
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "ProfitDuration [high=" + high + ", low=" + low + ", profit="
				+ profit + "]";
	}

}
