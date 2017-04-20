package com.deepak.coreman.ch12;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBinaryTreeOperation {

	private BNode root;
	private BinaryTree tree;

	BNode searchRoot;
	BinaryTree binaryTree;

	@Before
	public void setup() {
		root = getBinaryTree();
		tree = new BinaryTree(root, 7);

		searchRoot = getSearchTree();
		binaryTree = new BinaryTree(searchRoot, 11);
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

	@Test
	public void treeSearch() throws Exception {
		BNode node = binaryTree.search(4, searchRoot);
		assertNotNull(node);
		assertEquals(node.element, 4);
	}

	@Test
	public void findMax() throws Exception {
		BNode maxNode = binaryTree.max();
		assertNotNull(maxNode);
		assertEquals(maxNode.element, 20);
	}

	@Test
	public void findMaxRecursive() throws Exception {
		BNode maxNode = binaryTree.maxRecursive();
		assertNotNull(maxNode);
		assertEquals(maxNode.element, 20);
	}

	@Test
	public void findMin() throws Exception {
		BNode minNode = binaryTree.min();
		assertNotNull(minNode);
		assertEquals(minNode.element, 2);
	}

	@Test
	public void findMinRecursive() throws Exception {
		BNode minNode = binaryTree.minRecursive();
		assertNotNull(minNode);
		assertEquals(minNode.element, 2);
	}

	@Test
	public void findSucessor() throws Exception {
		BNode node = binaryTree.search(15, searchRoot);
		BNode result = binaryTree.successor(node);
		assertNotNull(result);
		assertEquals(17, result.element);
	}

	@Test
	public void findSucessorWithNoRightChild() throws Exception {
		BNode node = binaryTree.search(13, searchRoot);
		BNode result = binaryTree.successor(node);
		assertNotNull(result);
		assertEquals(15, result.element);
	}

	@Test
	public void findPredecessor() throws Exception {
		BNode node = binaryTree.search(15, searchRoot);
		BNode result = binaryTree.predecessor(node);
		assertNotNull(result);
		assertEquals(13, result.element);
	}

	@Test
	public void findPredecessorWithNoLeftChild() throws Exception {
		BNode node = binaryTree.search(17, searchRoot);
		BNode result = binaryTree.predecessor(node);
		assertNotNull(result);
		assertEquals(15, result.element);
	}

	@Test
	public void insertInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode = new BNode(15);
		binaryTree.insert(bNode);
		BNode root = binaryTree.getRoot();
		assertEquals(true, treeSatisfyPrepoerty(root));
		assertEquals(1, binaryTree.getSize());

	}

	@Test
	public void insertTwoElemenInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode1 = new BNode(15);
		BNode bNode2 = new BNode(6);
		binaryTree.insert(bNode1);
		binaryTree.insert(bNode2);
		BNode root = binaryTree.getRoot();
		assertEquals(true, treeSatisfyPrepoerty(root));
		assertEquals(2, binaryTree.getSize());

	}

	@Test
	public void insertThreeElemenInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode1 = new BNode(15);
		BNode bNode2 = new BNode(6);
		BNode bNode3 = new BNode(7);
		binaryTree.insert(bNode1);
		binaryTree.insert(bNode2);
		binaryTree.insert(bNode3);
		BNode root = binaryTree.getRoot();
		assertEquals(3, getNodeCount(root));
		assertEquals(true, treeSatisfyPrepoerty(root));

	}

	@Test
	public void insertMoreElemenInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode15 = new BNode(15);
		BNode bNode6 = new BNode(6);
		BNode bNode7 = new BNode(7);
		BNode bNode18 = new BNode(18);
		BNode bNode17 = new BNode(17);
		BNode bNode3 = new BNode(3);
		BNode bNode2 = new BNode(2);
		BNode bNode4 = new BNode(4);
		BNode bNode13 = new BNode(13);
		BNode bNode9 = new BNode(9);
		BNode bNode20 = new BNode(20);

		binaryTree.insert(bNode15);
		binaryTree.insert(bNode6);
		binaryTree.insert(bNode7);
		binaryTree.insert(bNode18);
		binaryTree.insert(bNode17);
		binaryTree.insert(bNode3);
		binaryTree.insert(bNode2);
		binaryTree.insert(bNode4);
		binaryTree.insert(bNode13);
		binaryTree.insert(bNode9);
		binaryTree.insert(bNode20);

		BNode root = binaryTree.getRoot();
		assertEquals(11, getNodeCount(root));
		assertEquals(true, treeSatisfyPrepoerty(root));

	}

	@Test
	public void insertRecursivelyInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode = new BNode(15);
		binaryTree.insertRecurse(bNode);
		BNode root = binaryTree.getRoot();
		assertEquals(true, treeSatisfyPrepoerty(root));
		assertEquals(1, getNodeCount(root));

	}

	@Test
	public void insertTwoElementsRecursivelyInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode15 = new BNode(15);
		BNode bNode6 = new BNode(6);
		binaryTree.insertRecurse(bNode15);
		binaryTree.insertRecurse(bNode6);
		BNode root = binaryTree.getRoot();
		assertEquals(true, treeSatisfyPrepoerty(root));
		assertEquals(2, getNodeCount(root));

	}

	@Test(expected = StackOverflowError.class)
	public void insertEqualElementsInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		for (int i = 0; i < 10000; i++) {
			BNode bNode15 = new BNode(15);
			binaryTree.insert(bNode15);
		}
		BNode root = binaryTree.getRoot();
		assertEquals(true, treeSatisfyPrepoerty(root));
		assertEquals(1000, getNodeCount(root));

	}

	@Test
	public void insertEqualElementsOptimally() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		for (int i = 0; i < 1000000; i++) {
			BNode bNode15 = new BNode(15);
			binaryTree.insertOptimally(bNode15);
		}
		BNode root = binaryTree.getRoot();
		assertEquals(true, treeSatisfyPrepoerty(root));
		assertEquals(1000000, getNodeCount(root));
	}

	@Test
	public void insertRecursivlyMoreElemenInBinartTree() throws Exception {
		BinaryTree binaryTree = new BinaryTree();
		BNode bNode15 = new BNode(15);
		BNode bNode6 = new BNode(6);
		BNode bNode7 = new BNode(7);
		BNode bNode18 = new BNode(18);
		BNode bNode17 = new BNode(17);
		BNode bNode3 = new BNode(3);
		BNode bNode2 = new BNode(2);
		BNode bNode4 = new BNode(4);
		BNode bNode13 = new BNode(13);
		BNode bNode9 = new BNode(9);
		BNode bNode20 = new BNode(20);

		binaryTree.insertRecurse(bNode15);
		binaryTree.insertRecurse(bNode6);
		binaryTree.insertRecurse(bNode7);
		binaryTree.insertRecurse(bNode18);
		binaryTree.insertRecurse(bNode17);
		binaryTree.insertRecurse(bNode3);
		binaryTree.insertRecurse(bNode2);
		binaryTree.insertRecurse(bNode4);
		binaryTree.insertRecurse(bNode13);
		binaryTree.insertRecurse(bNode9);
		binaryTree.insertRecurse(bNode20);

		BNode root = binaryTree.getRoot();
		assertEquals(11, getNodeCount(root));
		assertEquals(true, treeSatisfyPrepoerty(root));

	}

	@Test
	public void deleteRoot() throws Exception {
		BNode bNode = binaryTree.search(15, searchRoot);
		binaryTree.delete(bNode);
		assertEquals(10, getNodeCount(binaryTree.getRoot()));
		assertEquals(true, treeSatisfyPrepoerty(binaryTree.getRoot()));

	}

	@Test
	public void deleteNodeWithTwoChild() throws Exception {
		BNode bNode = binaryTree.search(6, searchRoot);
		binaryTree.delete(bNode);
		assertEquals(10, getNodeCount(binaryTree.getRoot()));
		assertEquals(true, treeSatisfyPrepoerty(binaryTree.getRoot()));

	}

	@Test
	public void deleteNodeWithOnlyLeftChild() throws Exception {
		BNode bNode = binaryTree.search(13, searchRoot);
		binaryTree.delete(bNode);
		assertEquals(10, getNodeCount(binaryTree.getRoot()));
		assertEquals(true, treeSatisfyPrepoerty(binaryTree.getRoot()));

	}

	@Test
	public void deleteNodeWithOnlyRightChild() throws Exception {
		BNode bNode = binaryTree.search(7, searchRoot);
		binaryTree.delete(bNode);
		assertEquals(10, getNodeCount(binaryTree.getRoot()));
		assertEquals(true, treeSatisfyPrepoerty(binaryTree.getRoot()));

	}

	@Test
	public void deleteNodeWithNoChild() throws Exception {
		BNode bNode = binaryTree.search(20, searchRoot);
		binaryTree.delete(bNode);
		assertEquals(10, getNodeCount(binaryTree.getRoot()));
		assertEquals(true, treeSatisfyPrepoerty(binaryTree.getRoot()));

	}

	private int getNodeCount(BNode root) {
		if (root == null)
			return 0;
		else
			return 1 + getNodeCount(root.left) + getNodeCount(root.right);

	}

	private boolean treeSatisfyPrepoerty(BNode root) {
		if (root == null)
			return true;
		BNode left = root.left;
		BNode right = root.right;
		if (left != null && left.element > root.element)
			return false;
		if (right != null && right.element < root.element)
			return false;

		treeSatisfyPrepoerty(root.left);
		treeSatisfyPrepoerty(root.right);
		return true;
	}

	private BNode getSearchTree() {
		BNode bNode15 = new BNode(15);
		BNode bNode6 = new BNode(6);
		BNode bNode3 = new BNode(3);
		BNode bNode7 = new BNode(7);
		BNode bNode2 = new BNode(2);
		BNode bNode4 = new BNode(4);
		BNode bNode13 = new BNode(13);
		BNode bNode9 = new BNode(9);
		BNode bNode18 = new BNode(18);
		BNode bNode17 = new BNode(17);
		BNode bNode20 = new BNode(20);

		bNode15.left = bNode6;
		bNode15.right = bNode18;
		bNode6.parent = bNode15;
		bNode18.parent = bNode15;

		bNode6.left = bNode3;
		bNode6.right = bNode7;
		bNode3.parent = bNode6;
		bNode7.parent = bNode6;

		bNode3.left = bNode2;
		bNode3.right = bNode4;
		bNode2.parent = bNode3;
		bNode4.parent = bNode3;

		bNode7.right = bNode13;
		bNode13.parent = bNode7;

		bNode13.left = bNode9;
		bNode9.parent = bNode13;

		bNode18.left = bNode17;
		bNode18.right = bNode20;
		bNode17.parent = bNode18;
		bNode20.parent = bNode18;

		return bNode15;
	}

}
