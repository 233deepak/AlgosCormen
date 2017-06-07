package com.deepak.coreman.ch12;

public class BNode {

	int element;
	BNode left;
	BNode right;
	BNode parent;
	boolean equalFlag;
	
	String text;
	

	public BNode(int element) {
		this.element = element;
		this.equalFlag =false;
	}

	@Override
	public String toString() {
		return "BNode [element=" + element + ", left=" + left + ", right="
				+ right + "]";
	}

	public BNode getLeft() {
		return left;
	}

	public void setLeft(BNode left) {
		this.left = left;
	}

	public BNode getRight() {
		return right;
	}

	public void setRight(BNode right) {
		this.right = right;
	}

	public BNode getParent() {
		return parent;
	}

	public void setParent(BNode parent) {
		this.parent = parent;
	}
	
	

}
