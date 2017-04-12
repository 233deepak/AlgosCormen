package com.deepak.coreman.ch12;

import java.util.Stack;

public class BinaryTree {

	private BNode root;
	private int size;
	private int globalindex;
	

	public BinaryTree(BNode bNode, int size) {
		this.root = bNode;
		this.size = size;

	}

	public int[] getInOrder() {
		if (root.left == null && root.right == null)
			return new int[] { root.element };
		int[] inOrder = new int[size];
		int index = 0;
		Stack<BNode> stack = new Stack<BNode>();
		while (root != null || stack.size() > 0) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				inOrder[index++] = root.element;
				root = root.right;
			}

		}
		return inOrder;
	}

	public int[] preOrder() {
		int[] preOrder = new int[size];
		int index = 0;
		preOrderTraverse(root, index, preOrder);
		return preOrder;
	}

	private void preOrderTraverse(BNode root, Integer index, int[] preOrder) {
		if (root == null)
			return;
		preOrder[globalindex++] = root.element;
		preOrderTraverse(root.left, index, preOrder);
		preOrderTraverse(root.right, index, preOrder);

	}

	public int[] postOrder() {
		int[] postOrder = new int[size];
		int index = 0;
		postOrderTraverse(root, index, postOrder);
		return postOrder;
	}

	private void postOrderTraverse(BNode root, int index, int[] postOrder) {
		if (root == null)
			return;
		postOrderTraverse(root.left, index, postOrder);
		postOrderTraverse(root.right, index, postOrder);
		postOrder[globalindex++] = root.element;

		
	}

}
