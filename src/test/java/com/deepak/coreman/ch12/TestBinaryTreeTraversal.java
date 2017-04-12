package com.deepak.coreman.ch12;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinaryTreeTraversal {

	private BNode root;
	private BinaryTree tree;

	@Before
	public void setup() {
		root = getBinaryTree();
		tree = new BinaryTree(root, 7);
	}

	private BNode getBinaryTree() {
		BNode node10 = new BNode(10);
		BNode node5 = new BNode(5);
		BNode node4 = new BNode(4);
		BNode node17 = new BNode(17);
		BNode node16 = new BNode(16);
		BNode node1 = new BNode(1);
		BNode node21 = new BNode(21);

		node10.left = node4;
		node10.right = node17;
		node4.parent = node10;
		node17.parent = node10;

		node4.left = node1;
		node4.right = node5;
		node1.parent = node4;
		node5.parent = node4;

		node17.left = node16;
		node17.right = node21;
		node16.parent = node17;
		node21.parent = node17;

		return node10;
	}

	@Test
	public void doNothing() throws Exception {

	}

	@Test
	public void nonRecursiveInorder() throws Exception {
		int[] inorder = tree.getInOrder();
		assertArrayEquals(new int[] { 1, 4, 5, 10, 16, 17, 21 }, inorder);

	}

	@Test
	public void recursivePreOrder() throws Exception {
		int[] preOrder = tree.preOrder();
		assertArrayEquals(new int[] { 10, 4, 1, 5, 17, 16, 21 }, preOrder);

	}
	
	@Test
	public void recursivePostOrder() throws Exception {
		int[] preOrder = tree.postOrder();
		assertArrayEquals(new int[] { 1, 5, 4, 16, 21, 17, 10 }, preOrder);

	}


}
