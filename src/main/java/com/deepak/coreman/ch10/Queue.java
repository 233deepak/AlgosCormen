package com.deepak.coreman.ch10;

import com.deepak.coreman.common.ArrayHelper;

public class Queue {

	private static final int INITIAL_SIZE = 12;

	private int[] array;
	private int head;
	private int tail;

	public Queue() {
		array = new int[INITIAL_SIZE];
		head = tail = 0;
	}

	public void enqueue(int x) {
		if ((tail + 1) == head) {
			System.out.println("Queue Overflow");
		}
		array[tail] = x;
		if (tail + 1 == array.length)
			tail = 1;
		else
			tail++;
		printStatus();
	}

	public int dequeue() {
		if (tail == head) {
			System.out.println("Queue underflow");
		}
		int x = array[head];
		if (head + 1 == array.length) {
			head = 1;
		} else {
			head++;
		}
		printStatus();
		return x;

	}

	private void printStatus() {
		ArrayHelper.printArray(array);
		System.out.println("head=" + head + " tail=" + tail);

	}

}
