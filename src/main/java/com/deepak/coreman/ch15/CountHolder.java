package com.deepak.coreman.ch15;

public class CountHolder {

	int numberEndsWithZero;
	int numberEndsWithOne;

	public CountHolder(int numberEndsWithZero, int numberEndsWithOne) {
		super();
		this.numberEndsWithZero = numberEndsWithZero;
		this.numberEndsWithOne = numberEndsWithOne;
	}

	@Override
	public String toString() {
		return "CountHolder [numberEndsWithZero=" + numberEndsWithZero
				+ ", numberEndsWithOne=" + numberEndsWithOne + "]";
	}

}
