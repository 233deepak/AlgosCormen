package com.deepak.coreman.ch10;

import com.deepak.coreman.common.ArrayHelper;

public class TwoStackUsingArray {

	private static final int INITIAL_SIZE = 12;

	private int top1;
	private int top2;
	private int totalCount;
	int[] sArray;

	public TwoStackUsingArray() {
		sArray = new int[INITIAL_SIZE];
		top1 = -1;
		top2 = sArray.length;
	}

	public void push1(int x) {
		if ((totalCount + 1) == sArray.length) {
			System.out.println("Stack Overflow");
			return;
		}
		top1++;
		sArray[top1] = x;
		printStatus();
		totalCount++;
	}

	public void push2(int x) {
		if ((totalCount + 1) == sArray.length) {
			System.out.println("Stack Overflow");
			return;
		}
		top2--;
		sArray[top2] = x;
		printStatus();
		totalCount++;
	}

	public int pop1() {
		if (totalCount == 0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = sArray[top1];
		top1--;
		totalCount--;
		printStatus();
		return x;

	}

	public int pop2() {
		if (totalCount == 0) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = sArray[top2];
		top2++;
		totalCount--;
		printStatus();
		return x;

	}

	private void printStatus() {
		ArrayHelper.printArray(sArray);
		System.out.println("top1=" + top1 + "top2=" + top2);

	}

}
