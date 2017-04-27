package com.deepak.coreman.ch13;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestRotation {

	private RedBlackTree redBlackTree;

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void rotateNillNode() {
		RBNode node = new RBNode(-1, RBNode.BLACK_COLOR);
		redBlackTree = new RedBlackTree(node);
		redBlackTree.rotateLeft(node);
		Assert.assertEquals(-1, node.key);
	}

	@Test
	public void leftRotate2Node() throws Exception {
		RBNode node5 = new RBNode(5, RBNode.BLACK_COLOR);
		RBNode node6 = new RBNode(6, RBNode.BLACK_COLOR);
		RBNode nodeNill = new RBNode(-1, RBNode.BLACK_COLOR);
		node5.right = node6;
		node5.left = nodeNill;
		node5.parent = nodeNill;

		node6.parent = node5;
		node6.left = node6.right = nodeNill;
		redBlackTree = new RedBlackTree(node5);
		redBlackTree.rotateLeft(node5);
		assertEquals(6, redBlackTree.getRoot().key);

	}

	@Test
	public void leftRotateWith3Node() throws Exception {
		RBNode node5 = new RBNode(5, RBNode.BLACK_COLOR);
		RBNode node6 = new RBNode(6, RBNode.BLACK_COLOR);
		RBNode node7 = new RBNode(7, RBNode.BLACK_COLOR);
		RBNode nodeNill = new RBNode(-1, RBNode.BLACK_COLOR);
		node5.right = node6;
		node5.left = nodeNill;
		node5.parent = nodeNill;

		node6.parent = node5;
		node6.left = nodeNill;
		node6.right = node7;

		node7.left = node7.right = nodeNill;
		node7.parent = node6;
		redBlackTree = new RedBlackTree(node5);
		redBlackTree.rotateLeft(node6);
		assertEquals(7, redBlackTree.getRoot().right.key);
	}

	@Test
	public void leftRotateWith3LeftNode() throws Exception {
		RBNode node5 = new RBNode(5, RBNode.BLACK_COLOR);
		RBNode node6 = new RBNode(6, RBNode.BLACK_COLOR);
		RBNode node7 = new RBNode(7, RBNode.BLACK_COLOR);
		RBNode nodeNill = new RBNode(-1, RBNode.BLACK_COLOR);
		node5.right = nodeNill;
		node5.left = node6;
		node5.parent = nodeNill;

		node6.parent = node5;
		node6.left = nodeNill;
		node6.right = node7;

		node7.left = node7.right = nodeNill;
		node7.parent = node6;
		redBlackTree = new RedBlackTree(node5);
		redBlackTree.rotateLeft(node6);
		assertEquals(7, redBlackTree.getRoot().left.key);
	}

	@Test
	public void leftRotateWithMoreElements() throws Exception {
		RBNode node7 = new RBNode(7, RBNode.BLACK_COLOR);
		RBNode node4 = new RBNode(4, RBNode.BLACK_COLOR);
		RBNode node11 = new RBNode(11, RBNode.BLACK_COLOR);
		RBNode node9 = new RBNode(9, RBNode.BLACK_COLOR);
		RBNode node18 = new RBNode(18, RBNode.BLACK_COLOR);
		RBNode node14 = new RBNode(14, RBNode.BLACK_COLOR);
		RBNode node19 = new RBNode(19, RBNode.BLACK_COLOR);
		RBNode nodeNill = new RBNode(-1, RBNode.BLACK_COLOR);

		node7.left = node4;
		node7.right = node11;
		node7.parent = nodeNill;

		node11.parent = node7;
		node11.left = node9;
		node11.right = node18;

		node18.parent = node11;
		node18.left = node14;
		node18.right = node19;

		node4.left = node4.right = nodeNill;
		node4.parent = node7;

		node9.left = node9.right = nodeNill;
		node9.parent = node11;

		node14.left = node14.right = nodeNill;
		node14.parent = node18;

		node19.left = node19.right = nodeNill;
		node19.parent = node18;

		redBlackTree = new RedBlackTree(node7);
		redBlackTree.rotateLeft(node11);

		assertEquals(18, redBlackTree.getRoot().right.key);
	}

	@Test
	public void rightRotateWith2Node() throws Exception {
		RBNode node5 = new RBNode(5, RBNode.BLACK_COLOR);
		RBNode node6 = new RBNode(6, RBNode.BLACK_COLOR);
		RBNode nodeNill = new RBNode(-1, RBNode.BLACK_COLOR);
		node5.right = nodeNill;
		node5.left = node6;
		node5.parent = nodeNill;

		node6.parent = node5;
		node6.left = node6.right = nodeNill;

		redBlackTree = new RedBlackTree(node5);
		redBlackTree.rotateRight(node5);
		assertEquals(6, redBlackTree.getRoot().key);
	}

	@Test
	public void rightRotateWith3Node() throws Exception {
		RBNode node5 = new RBNode(5, RBNode.BLACK_COLOR);
		RBNode node6 = new RBNode(6, RBNode.BLACK_COLOR);
		RBNode node7 = new RBNode(7, RBNode.BLACK_COLOR);
		RBNode nodeNill = new RBNode(-1, RBNode.BLACK_COLOR);

		node7.left = node6;
		node7.right = node7.parent = nodeNill;

		node6.left = node5;
		node6.right = nodeNill;
		node6.parent = node7;

		node5.left = node5.right = nodeNill;
		node5.parent = node6;

		redBlackTree = new RedBlackTree(node7);
		redBlackTree.rotateRight(node6);
		assertEquals(5, redBlackTree.getRoot().left.key);
		assertEquals(7, redBlackTree.getRoot().left.parent.key);
	}

}
