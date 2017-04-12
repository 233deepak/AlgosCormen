package com.deepak.coreman.ch12;

public class BNode {

	int element;
	BNode left;
	BNode right;
	BNode parent;

	public BNode(int element) {
		this.element = element;
	}

	@Override
	public String toString() {
		return "BNode [element=" + element + ", left=" + left + ", right="
				+ right + "]";
	}

}
