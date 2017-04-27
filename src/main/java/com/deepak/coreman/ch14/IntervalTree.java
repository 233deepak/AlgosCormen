package com.deepak.coreman.ch14;

import java.util.ArrayList;
import java.util.List;

import com.deepak.coreman.ch13.Interval;
import com.deepak.coreman.ch13.RBNode;
import com.deepak.coreman.ch13.RedBlackTree;

public class IntervalTree {

	private RBNode root;
	private RedBlackTree redBlackTree;

	public IntervalTree(RBNode root) {
		super();
		this.root = root;
		this.redBlackTree = new RedBlackTree(this.root);
	}

	public void insert(RBNode node16) {
		redBlackTree.insert(node16);
		updateMax(node16);

	}

	private void updateMax(RBNode node) {
		while (node.key != -1) {
			node.max = max(node.interval.high, node.left.max, node.right.max);
			node = node.parent;
		}

	}

	private int max(int high, int left, int right) {
		return (high > left) ? ((high > right) ? high : right)
				: (left > right) ? left : right;
	}

	public RBNode getRoot() {
		return redBlackTree.getRoot();
	}

	public RBNode searchInterval(Interval interval) {
		return searchInterval(interval, getRoot());
	}

	private RBNode searchInterval(Interval interval, RBNode node) {
		if (node.key == -1)
			return node;
		if (overlap(node.interval, interval))
			return node;
		if (node.max > interval.low)
			return searchInterval(interval, node.left);
		else
			return searchInterval(interval, node.right);
	}

	private boolean overlap(Interval interval, Interval interval2) {
		return (interval2.low <= interval.high && interval.low <= interval2.high);
	}

	public void leftRotate(RBNode node) {
		RBNode right = node.right;

		if (node == redBlackTree.getRoot()) {
			redBlackTree.setRoot(right);
		} else if (node == node.parent.left) {
			node.parent.left = right;
		} else if (node == node.parent.right) {
			node.parent.right = right;
		}

		node.right = right.left;
		right.parent = node.parent;
		node.parent = right;
		right.left = node;

		right.max = node.max;
		node.max = max(node.interval.high, node.left.max, node.right.max);

	}

	public RBNode searchMinInterval(Interval interval) {
		RBNode root = getRoot();
		return searchMinInterval(interval, root);

	}

	private RBNode searchMinInterval(Interval interval, RBNode root) {
		RBNode min = new RBNode(-1, null, null, null, RBNode.BLACK_COLOR);

		while (root.key != -1) {

			if (overlap(interval, root.interval)
					&& (min.key == -1 || root.interval.high < min.interval.high)) {
				min = root;
			}

			if (root.left.max > interval.low)
				root = root.left;
			else
				root = root.right;
		}

		return min;

	}

	public List<RBNode> findAllOverlaps(Interval interval) {
		List<RBNode> nodes = new ArrayList<RBNode>();
		findAllOverlaps(interval, getRoot(), nodes);
		return nodes;
	}

	private void findAllOverlaps(Interval interval, RBNode root,
			List<RBNode> nodes) {
		if (root.key == -1)
			return;
		if (overlap(root.interval, interval))
			nodes.add(root);
		if(root.left.max>interval.low)
			findAllOverlaps(interval, root.left, nodes);
		else
			findAllOverlaps(interval, root.right, nodes);
	}

	public RBNode exactSearch(Interval interval) {
		return exactSearch(interval,getRoot());
	}

	private RBNode exactSearch(Interval interval, RBNode root) {
		 if(root.key ==-1)
			 return root;
		 if(exactEquals(interval, root)){
			 return root;
		 }
		 else if(interval.low >root.key)
			 return exactSearch(interval, root.right);
		 else
			 return exactSearch(interval, root.left);
	}

	private boolean exactEquals(Interval interval, RBNode root) {
		return root.interval.low ==interval.low && root.interval.high ==interval.high;
	}

}
