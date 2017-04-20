package com.deepak.coreman.ch12;

public class RadixTree {

	private BNode root;

	public RadixTree() {
		root = new BNode(-1);
	}

	public BNode getRoot() {
		return root;
	}

	public void insert(String text) {
		char[] bits = text.toCharArray();
		BNode temp = root;
		BNode parent = root;
		for (char bit : bits) {
			parent = temp;
			if (bit == '0') {
				temp = temp.left;
				if (temp == null) {
					temp = new BNode(-1);
					parent.left = temp;
				}
			} else if (bit == '1') {
				temp = temp.right;
				if (temp == null) {
					temp = new BNode(-1);
					parent.right = temp;
				}
			}
		}
		temp.element = 1;
		temp.text = text;
	}

}
