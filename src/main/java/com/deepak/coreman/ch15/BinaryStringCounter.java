package com.deepak.coreman.ch15;

public class BinaryStringCounter {

	public int countNonConsecutiveOneString(int length) {
		CountHolder holder = countString(length);
		return holder.numberEndsWithOne + holder.numberEndsWithZero;
	}

	private CountHolder countString(int length) {
		if (length == 1) {
			return new CountHolder(1, 1);
		}

		CountHolder holder = countString(length - 1);
		int countOfZero = holder.numberEndsWithZero;
		holder.numberEndsWithZero = holder.numberEndsWithOne
				+ holder.numberEndsWithZero;
		holder.numberEndsWithOne = countOfZero;
		return holder;
	}

}
