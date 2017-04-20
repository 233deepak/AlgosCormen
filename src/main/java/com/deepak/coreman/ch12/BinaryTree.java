package com.deepak.coreman.ch12;

import java.util.Stack;

public class BinaryTree {

	private BNode root;
	private int size;
	private int globalindex;

	public BinaryTree() {
	}

	public BinaryTree(BNode bNode, int size) {
		this.root = bNode;
		this.size = size;

	}

	public BNode getRoot() {
		return root;
	}

	public void setRoot(BNode root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
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

	public BNode search(int key, BNode root) {
		if (root.element == key)
			return root;
		if (key > root.element)
			return search(key, root.right);
		else
			return search(key, root.left);
	}

	public BNode max() {
		return max(root);
	}

	private BNode max(BNode root) {
		while (root.right != null) {
			root = root.right;
		}
		return root;
	}

	public BNode maxRecursive() {
		return maxRecursive(root);
	}

	private BNode maxRecursive(BNode root) {
		if (root.right == null)
			return root;
		return maxRecursive(root.right);
	}

	public BNode min() {
		return min(root);
	}

	private BNode min(BNode root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	public BNode minRecursive() {
		return minRecursive(root);
	}

	private BNode minRecursive(BNode root) {
		if (root.left == null)
			return root;
		return minRecursive(root.left);
	}

	public BNode successor(BNode node) {
		if (node.right != null)
			return min(node.right);
		BNode temp = node.parent;
		while (temp != null && node == temp.right) {
			node = temp;
			temp = temp.parent;
		}
		return temp;
	}

	public BNode predecessor(BNode node) {
		if (node.left != null) {
			return max(node.left);
		}
		BNode temp = node.parent;
		while (temp != null && temp.left == node) {
			node = temp;
			temp = temp.parent;
		}
		return temp;
	}

	public void insert(BNode bNode) {
		size++;
		if (root == null) {
			root = bNode;
			return;
		}
		BNode temp = root;
		BNode parent = root;
		while (temp != null) {
			parent = temp;
			if (bNode.element < temp.element)
				temp = temp.left;
			else
				temp = temp.right;
		}

		if (bNode.element < parent.element)
			parent.left = bNode;
		else
			parent.right = bNode;

	}

	public void delete(BNode bNode) {
		if (bNode.left == null) {
			transplant(bNode, bNode.right);
		} else if (bNode.right == null) {
			transplant(bNode, bNode.left);
		} else {
			BNode successor = successor(bNode);
			if (successor == bNode.right) {
				transplant(bNode, successor);
			} else {
				transplant(successor, successor.right);
				successor.right = bNode.right;
				successor.right.parent = successor;
				transplant(bNode, successor);
			}
			successor.left = bNode.left;
			successor.left.parent = successor;
		}

	}

	private void transplant(BNode u, BNode v) {
		if (u.parent == null)
			root = v;
		else if (u.parent.left == u)
			u.parent.left = v;
		else
			u.parent.right = v;
		if (v != null)
			v.parent = u.parent;
	}

	public void insertRecurse(BNode bNode) {
		if (root == null) {
			root = bNode;
			return;
		}
		BNode parent = root;
		parent = searchForCorrectNode(root, parent, bNode);

		if (bNode.element < parent.element)
			parent.left = bNode;
		else
			parent.right = bNode;

	}

	private BNode searchForCorrectNode(BNode root, BNode parent, BNode bNode) {
		if (root == null)
			return parent;
		parent = root;
		if (bNode.element < root.element)
			return searchForCorrectNode(root.left, parent, bNode);
		else
			return searchForCorrectNode(root.right, parent, bNode);
	}

	public void insertOptimally(BNode bNode) {
		if (root == null) {
			root = bNode;
			return;
		}
		BNode parent = root;
		BNode temp = root;
		while (temp != null) {
			parent = temp;
			if (bNode.element == temp.element) {
				temp.equalFlag = !temp.equalFlag;
				temp = (temp.equalFlag) ? temp.right : temp.left;

			} else if (bNode.element < temp.element)
				temp = temp.left;
			else
				temp = temp.right;
		}
		if (bNode.element == parent.element) {
			if (parent.equalFlag)
				parent.right = bNode;
			else
				parent.left = bNode;

		} else if (bNode.element < parent.element)
			parent.left = bNode;
		else
			parent.right = bNode;
		bNode.parent = parent;

	}
}
