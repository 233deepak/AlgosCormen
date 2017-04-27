package com.deepak.coreman.ch13;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRBInsert {

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void insertNill() throws Exception {
		RBNode root = new RBNode(-1, RBNode.BLACK_COLOR);
		RedBlackTree redBlackTree = new RedBlackTree(root);
		redBlackTree.insert(root);
		assertEquals(-1, redBlackTree.getRoot().key);

	}

	@Test
	public void insertSingleNode() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, RBNode.BLACK_COLOR);

		node41.left = node41.right = node41.parent = nillNode;
		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		assertEquals(41, redBlackTree.getRoot().key);
	}

	@Test
	public void insert2Node() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);

		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		redBlackTree.insert(node38);
		assertEquals(2, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	@Test
	public void insert3Node() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node31 = new RBNode(31, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);

		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		redBlackTree.insert(node38);
		redBlackTree.insert(node31);
		assertEquals(3, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	@Test
	public void insert4Node() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node31 = new RBNode(31, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node12 = new RBNode(12, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);

		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		redBlackTree.insert(node38);
		redBlackTree.insert(node31);
		redBlackTree.insert(node12);
		assertEquals(4, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	@Test
	public void insert5Node() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node31 = new RBNode(31, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node12 = new RBNode(12, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node9 = new RBNode(9, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);

		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		redBlackTree.insert(node38);
		redBlackTree.insert(node31);
		redBlackTree.insert(node12);
		redBlackTree.insert(node9);
		assertEquals(5, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	@Test
	public void insert6Node() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node31 = new RBNode(31, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node12 = new RBNode(12, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node9 = new RBNode(9, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node6 = new RBNode(6, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);

		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		redBlackTree.insert(node38);
		redBlackTree.insert(node31);
		redBlackTree.insert(node12);
		redBlackTree.insert(node9);
		redBlackTree.insert(node6);
		assertEquals(6, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	@Test
	public void insert7Node() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node31 = new RBNode(31, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node12 = new RBNode(12, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node9 = new RBNode(9, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node6 = new RBNode(6, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node7 = new RBNode(7, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);

		RedBlackTree redBlackTree = new RedBlackTree(nillNode);
		redBlackTree.insert(node41);
		redBlackTree.insert(node38);
		redBlackTree.insert(node31);
		redBlackTree.insert(node12);
		redBlackTree.insert(node9);
		redBlackTree.insert(node6);
		redBlackTree.insert(node7);
		assertEquals(7, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	@Test
	public void rightSubChild() throws Exception {
		RBNode nillNode = new RBNode(-1, RBNode.BLACK_COLOR);
		RBNode node7 = new RBNode(7, nillNode, nillNode, nillNode,
				RBNode.BLACK_COLOR);
		RBNode node3 = new RBNode(3, nillNode, nillNode, nillNode,
				RBNode.BLACK_COLOR);
		RBNode node18 = new RBNode(18, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node10 = new RBNode(10, nillNode, nillNode, nillNode,
				RBNode.BLACK_COLOR);
		RBNode node11 = new RBNode(11, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node8 = new RBNode(8, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node22 = new RBNode(22, nillNode, nillNode, nillNode,
				RBNode.BLACK_COLOR);
		RBNode node26 = new RBNode(26, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node15 = new RBNode(15, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		node7.left = node3;
		node7.right = node18;
		node3.parent = node18.parent = node7;

		node18.left = node10;
		node18.right = node22;
		node10.parent = node22.parent = node18;

		node22.right = node26;
		node26.parent = node22;

		node10.left = node8;
		node10.right = node11;
		node8.parent = node11.parent = node10;

		RedBlackTree redBlackTree = new RedBlackTree(node7);
		redBlackTree.insert(node15);
		assertEquals(9, countNodes(redBlackTree.getRoot()));
		assertEquals(true, satisfyRBProperty(redBlackTree.getRoot()));

	}

	private int countNodes(RBNode root) {
		if (root == null)
			return 0;
		if (root.key != -1)
			return 1 + countNodes(root.left) + countNodes(root.right);
		else
			return 0 + countNodes(root.left) + countNodes(root.right);

	}

	private boolean satisfyRBProperty(RBNode root) {
		if (root == null)
			return true;
		RBNode left = root.left;
		RBNode right = root.right;
		if (root.colour == RBNode.RED_COLOR
				&& (left.colour == RBNode.RED_COLOR || right.colour == RBNode.RED_COLOR))
			return false;
		return satisfyRBProperty(left) && satisfyRBProperty(right);
	}

}
