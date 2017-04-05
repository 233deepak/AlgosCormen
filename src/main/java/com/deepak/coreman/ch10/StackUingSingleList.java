package com.deepak.coreman.ch10;

public class StackUingSingleList {

	private LinkedList linkedList;

	public StackUingSingleList() {
		linkedList = new SingleLinkedList();

	}

	public void push(int key) {
		linkedList.insertAtBegning(key);
	}

	public int pop() {
		return linkedList.deleteFromBegning();
	}

}
