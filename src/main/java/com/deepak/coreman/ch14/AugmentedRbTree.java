package com.deepak.coreman.ch14;

import com.deepak.coreman.ch13.RBNode;
import com.deepak.coreman.ch13.RedBlackTree;

public class AugmentedRbTree {

	private RBNode root;
	private RedBlackTree redBlackTree;

	public AugmentedRbTree(RBNode root) {
		super();
		this.root = root;
		redBlackTree = new RedBlackTree(this.root);
	}

	public RBNode getRoot() {
		return redBlackTree.getRoot();
	}

	public void setRoot(RBNode root) {
		this.root = root;
	}

	public RBNode osSelect(int rank) {
          return osSelect(getRoot(),rank) ;
	}

	public RBNode osSelect(RBNode node, int rank) {
		int r = node.left.size + 1;
		if (r == rank)
			return node;
		else if (r > rank)
			return osSelect(node.left, rank);
		else
			return osSelect(node.right, rank - r);

	}

	public void insert(RBNode node) {
		redBlackTree.insert(node);

	}

	public int osRank() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
