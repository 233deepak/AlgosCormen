package com.deepak.coreman.common;

import org.junit.Assert;

import com.deepak.coreman.ch10.Node;

public class NodeHelper {

	public static void printNode(Node root) {
		printRecursive(root);

	}

	private static void printRecursive(Node root) {
		Assert.assertNotNull(root);
		if (root.isVisited())
			return;
		root.setVisited(true);
		System.out.println(root.getX() + " ");
		printRecursive(root.getNext());
		root.setVisited(false);
	}

	public static void printAllElement(Node root) {
		Node temp = root.getNext();
		System.out.println();
		while (temp.getX() != -1) {
			System.out.print(temp.getX() + " ");
			temp = temp.getNext();
		}
		System.out.println();

	}

}
