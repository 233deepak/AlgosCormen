package com.deepak.coreman.ch12;

import static org.junit.Assert.*;

import org.junit.Test;

public class RadixTreeTest {

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void createEmptyTree() throws Exception {
		RadixTree radixTree = new RadixTree();
		BNode bNode = radixTree.getRoot();
		assertEquals(-1, bNode.element);
	}

	@Test
	public void insertString() throws Exception {
		RadixTree radixTree = new RadixTree();
		radixTree.insert("0");
		BNode root = radixTree.getRoot();
		assertEquals(1, getNodeCount(root));
	}

	@Test
	public void insertStringWithTwoString() throws Exception {
		RadixTree radixTree = new RadixTree();
		radixTree.insert("0");
		radixTree.insert("10");
		BNode root = radixTree.getRoot();
		assertEquals(2, getNodeCount(root));
	}

	@Test
	public void insertFiveStringWithMoreThanOnecahrString() throws Exception {
		RadixTree radixTree = new RadixTree();
		radixTree.insert("1011");
		radixTree.insert("10");
		radixTree.insert("011");
		radixTree.insert("100");
		radixTree.insert("0");
		BNode root = radixTree.getRoot();
		assertEquals(5, getNodeCount(root));
	}
	
	

	private int getNodeCount(BNode root) {
		if (root == null)
			return 0;
		if (root.text !=null) {
			return 1 + getNodeCount(root.left) + getNodeCount(root.right);
		} else
			return getNodeCount(root.left) + getNodeCount(root.right);

	}

}
