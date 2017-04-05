package com.deepak.coreman.ch10;

public class Node {

	int x;
	Node next;
	Node prev;
	boolean isVisited;

	public Node(int x, Node next) {
		super();
		this.x = x;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [x=" + x + ", next=" + next + "]";
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
