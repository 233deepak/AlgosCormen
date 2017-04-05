package com.deepak.coreman.ch10;

public class QueueUsingStack {

	private Stack stack1;
	private Stack stack2;

	public QueueUsingStack() {
		stack1 = new Stack();
		stack2 = new Stack();
	}

	public void enqueue(int element) {
		if (stack2.getTop() != -1) {
			while (stack2.getTop() >= 0) {
				int x = stack2.pop();
				stack1.push(x);
			}
		}
		stack1.push(element);

	}

	public int dequeue() {
		if (stack1.getTop() != -1) {
			while (stack1.getTop() >= 0) {
				int x = stack1.pop();
				stack2.push(x);
			}
		}

		return stack2.pop();
	}

}
