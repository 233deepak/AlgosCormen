package com.deepak.coreman.ch14;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.ch13.RBNode;

public class TestOSSelect {

	private AugmentedRbTree augmentedTree;

	@Before
	public void setup() {
		RBNode nillNode = new RBNode(-1, null, null, null, RBNode.BLACK_COLOR);
		RBNode node26 = new RBNode(26, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node17 = new RBNode(17, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node14 = new RBNode(14, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node14B = new RBNode(14, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node10 = new RBNode(10, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node7 = new RBNode(7, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node3 = new RBNode(3, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node12 = new RBNode(12, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node16 = new RBNode(16, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node21 = new RBNode(21, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node19 = new RBNode(19, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node20 = new RBNode(20, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node21B = new RBNode(21, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node41 = new RBNode(41, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node30 = new RBNode(30, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node28 = new RBNode(28, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node38 = new RBNode(38, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node35 = new RBNode(35, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node39 = new RBNode(39, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		RBNode node47 = new RBNode(47, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		
		augmentedTree = new AugmentedRbTree(nillNode);
		augmentedTree.insert(node26);
		augmentedTree.insert(node17);
		augmentedTree.insert(node14);
		augmentedTree.insert(node10);
		augmentedTree.insert(node7);
		augmentedTree.insert(node3);
		augmentedTree.insert(node12);
		augmentedTree.insert(node16);
		augmentedTree.insert(node14B);
		augmentedTree.insert(node21);
		augmentedTree.insert(node21B);
		augmentedTree.insert(node19);
		augmentedTree.insert(node20);
		augmentedTree.insert(node41);
		augmentedTree.insert(node30);
		augmentedTree.insert(node28);
		augmentedTree.insert(node38);
		augmentedTree.insert(node35);
		augmentedTree.insert(node39);
		augmentedTree.insert(node47);
       		
	}

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void selectNodeWithRank1() throws Exception {
		RBNode nillNode = new RBNode(-1, null, null, null, RBNode.RED_COLOR);
		RBNode node26 = new RBNode(26, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		AugmentedRbTree augmentedTree = new AugmentedRbTree(node26);
		RBNode node = augmentedTree.osSelect(1);
		assertEquals(26, node.key);
	}

	@Test
	public void selectNodeWithRank2() throws Exception {
		RBNode node = augmentedTree.osSelect(1);
		assertEquals(3, node.key);
	}
	
	@Test
	public void selectNodeWithRank6() throws Exception {
		RBNode node = augmentedTree.osSelect(6);
		assertEquals(14, node.key);
	}
	
	@Test
	public void selectNodeWithRank10() throws Exception {
		RBNode node = augmentedTree.osSelect(10);
		assertEquals(20, node.key);
	}
	
	
	@Test
	public void rankOfNode() throws Exception {
		int rank = augmentedTree.osRank();
	}

}
