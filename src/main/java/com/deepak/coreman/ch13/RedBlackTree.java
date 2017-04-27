package com.deepak.coreman.ch13;

public class RedBlackTree {

	RBNode root;

	public RedBlackTree(RBNode root) {
		this.root = root;
	}

	public void rotateLeft(RBNode node) {
		if (root.key == -1 || node.key == -1)
			return;
		RBNode right = node.right;
		node.right = right.left;

		if (node.parent.key == -1) {
			root = right;
		} else if (node.parent.right == node) {
			node.parent.right = right;
		} else if (node.parent.left == node) {
			node.parent.left = right;
		}
		right.parent = node.parent;
		right.left = node;
		node.parent = right;

		right.size = node.size;
		node.size = node.left.size + node.right.size + 1;
	}

	public RBNode getRoot() {
		// TODO Auto-generated method stub
		return root;
	}

	public void rotateRight(RBNode node) {
		if (root.key == -1 || node.key == -1)
			return;

		RBNode left = node.left;
		node.left = left.right;

		if (node.parent.key == -1) {
			root = left;
		} else if (node == node.parent.left) {
			node.parent.left = left;
		} else if (node == node.parent.right) {
			node.parent.right = left;
		}

		left.right = node;
		left.parent = node.parent;
		node.parent = left;

		left.size = node.size;
		node.size = node.left.size + node.right.size + 1;

	}

	public void insert(RBNode node) {

		RBNode temp = root, parent = root;
		while (temp.key != -1) {
			temp.size += 1;
			parent = temp;
			if (node.key < temp.key)
				temp = temp.left;
			else if (node.key >= temp.key) {
				temp = temp.right;
			}
		}
		if (parent.key == -1) {
			root = node;
		} else if (node.key < parent.key) {
			parent.left = node;
			node.parent = parent;
		} else if (node.key >= parent.key) {
			parent.right = node;
			node.parent = parent;
		}
		node.size = 1;

		fixRBProperties(node);

	}

	private void fixRBProperties(RBNode node) {
		if (node.key == -1)
			return;
		while (node != root && node.parent.colour == RBNode.RED_COLOR)
			if (node.parent == node.parent.parent.left) {
				RBNode uncle = node.parent.parent.right;
				if (uncle.colour == RBNode.RED_COLOR) {
					uncle.colour = RBNode.BLACK_COLOR;
					node.parent.colour = RBNode.BLACK_COLOR;
					node.parent.parent.colour = RBNode.RED_COLOR;
					node = node.parent.parent;

				} else {

					if (node == node.parent.right) {
						node = node.parent;
						rotateLeft(node);
					}
					node.parent.colour = RBNode.BLACK_COLOR;
					node.parent.parent.colour = RBNode.RED_COLOR;
					rotateRight(node.parent.parent);

				}

			} else if (node.parent == node.parent.parent.right) {
				RBNode uncle = node.parent.parent.left;
				if (uncle.colour == RBNode.RED_COLOR) {
					uncle.colour = RBNode.BLACK_COLOR;
					node.parent.colour = RBNode.BLACK_COLOR;
					node.parent.parent.colour = RBNode.RED_COLOR;
					node = node.parent.parent;

				} else {
					if (node == node.parent.left) {
						node = node.parent;
						rotateRight(node);
					}
					node.parent.colour = RBNode.BLACK_COLOR;
					node.parent.parent.colour = RBNode.RED_COLOR;
					rotateLeft(node.parent.parent);
				}

			}

		root.colour = RBNode.BLACK_COLOR;

	}

	public void transplant(RBNode nodeU, RBNode nodeV) {
		if (nodeU == root) {
			root = nodeV;
		} else if (nodeU == nodeU.parent.left) {
			nodeU.parent.left = nodeV;
		} else {
			nodeU.parent.right = nodeV;
		}
		nodeV.parent = nodeU.parent;

	}

	public void delete(RBNode node) {
		RBNode y = node;
		String originalColour = y.colour;
		RBNode x = null;
		if (node.left.key == -1) {
			x = node.right;
			transplant(node, x);
		} else if (node.right.key == -1) {
			x = node.left;
			transplant(node, x);
		}
		if (originalColour == RBNode.BLACK_COLOR) {
			RBDeleteFix(x);
		}

	}

	private void RBDeleteFix(RBNode x) {

		while (x != root && x.colour == RBNode.BLACK_COLOR) {
			if (x == x.parent.left) {
				RBNode w = x.parent.right;
				if (w.colour == RBNode.RED_COLOR) {

				} else if (w.left.colour == RBNode.BLACK_COLOR
						&& w.right.colour == RBNode.BLACK_COLOR) {
					w.colour = RBNode.RED_COLOR;
					x = x.parent;

				}
			}
		}

	}

	public void setRoot(RBNode node) {
		this.root = node;

	}
}
