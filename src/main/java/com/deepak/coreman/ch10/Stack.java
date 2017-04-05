package com.deepak.coreman.ch10;

import com.deepak.coreman.common.ArrayHelper;

public class Stack {

	private static final int INITIAL_SIZE = 12;

	private int top;
	int[] sArray;

	public Stack() {
		this.sArray = new int[INITIAL_SIZE];
		this.top = -1;
	}

	public void push(int x) {
		if ((top + 1) == sArray.length) {
			System.out.println("Stack Overflow");
			return;
		}
		top++;
		sArray[top] = x;
		System.out.println(top);
		ArrayHelper.printArray(sArray);
	}

	public int pop() {
		if (this.top == -1) {
			System.out.println("Stack Underflow");
			return -1;
		}
		int x = sArray[top];
		top--;
		System.out.println(top);
		ArrayHelper.printArray(sArray);
		return x;
	}

	public int getTop() {
		return top;
	}

	public void decrementTop() {
		top--;
	}

}
