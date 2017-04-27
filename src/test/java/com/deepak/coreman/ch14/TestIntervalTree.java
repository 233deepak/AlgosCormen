package com.deepak.coreman.ch14;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.ch13.Interval;
import com.deepak.coreman.ch13.RBNode;

public class TestIntervalTree {

	private IntervalTree intervalTree;

	@Before
	public void setUp() {
		RBNode nillNode = new RBNode(-1, null, null, null, RBNode.BLACK_COLOR);
		RBNode node16 = getNode(nillNode, 16, 21);
		RBNode node25 = getNode(nillNode, 25, 30);
		RBNode node26 = getNode(nillNode, 26, 26);
		RBNode node17 = getNode(nillNode, 17, 19);
		RBNode node19 = getNode(nillNode, 19, 20);
		RBNode node8 = getNode(nillNode, 8, 9);
		RBNode node15 = getNode(nillNode, 15, 23);
		RBNode node5 = getNode(nillNode, 5, 8);
		RBNode node0 = getNode(nillNode, 0, 3);
		RBNode node6 = getNode(nillNode, 6, 10);

		intervalTree = new IntervalTree(nillNode);
		intervalTree.insert(node16);
		intervalTree.insert(node25);
		intervalTree.insert(node26);
		intervalTree.insert(node17);
		intervalTree.insert(node19);
		intervalTree.insert(node8);
		intervalTree.insert(node15);
		intervalTree.insert(node5);
		intervalTree.insert(node0);
		intervalTree.insert(node6);

	}

	@Test
	public void nothing() throws Exception {

	}

	@Test
	public void insertUpdateMax() throws Exception {
		RBNode nillNode = new RBNode(-1, null, null, null, RBNode.BLACK_COLOR);
		RBNode node16 = getNode(nillNode, 16, 21);
		intervalTree = new IntervalTree(nillNode);
		intervalTree.insert(node16);
		assertEquals(21, intervalTree.getRoot().max);
	}

	@Test
	public void insertMoreElements() throws Exception {
		RBNode nillNode = new RBNode(-1, null, null, null, RBNode.BLACK_COLOR);
		RBNode node16 = getNode(nillNode, 16, 21);
		RBNode node25 = getNode(nillNode, 25, 30);
		RBNode node26 = getNode(nillNode, 26, 26);
		RBNode node17 = getNode(nillNode, 17, 19);
		RBNode node19 = getNode(nillNode, 19, 20);
		RBNode node8 = getNode(nillNode, 8, 9);
		RBNode node15 = getNode(nillNode, 15, 23);
		RBNode node5 = getNode(nillNode, 5, 8);
		RBNode node0 = getNode(nillNode, 0, 3);
		RBNode node6 = getNode(nillNode, 6, 10);

		intervalTree = new IntervalTree(nillNode);
		intervalTree.insert(node16);
		intervalTree.insert(node25);
		intervalTree.insert(node26);
		intervalTree.insert(node17);
		intervalTree.insert(node19);
		intervalTree.insert(node8);
		intervalTree.insert(node15);
		intervalTree.insert(node5);
		intervalTree.insert(node0);
		intervalTree.insert(node6);

		assertEquals(30, intervalTree.getRoot().max);

	}

	@Test
	public void searchOverlap() throws Exception {
		RBNode node = intervalTree.searchInterval(new Interval(22, 25));
		assertEquals(15, node.interval.low);
	}
	
	@Test
	public void searchOverlapNotFound() throws Exception {
		RBNode node = intervalTree.searchInterval(new Interval(11, 14));
		assertEquals(null, node.interval);
	}
	
	@Test
	public void leftRotate() throws Exception {
		intervalTree.leftRotate(intervalTree.getRoot());
		assertEquals(25, intervalTree.getRoot().key);
		assertEquals(17, intervalTree.getRoot().left.key);
	}
	
	@Test
	public void leftRotateInnerNode() throws Exception {
		intervalTree.leftRotate(intervalTree.getRoot().left.left);
		assertEquals(8, intervalTree.getRoot().left.left.key);
		//assertEquals(17, intervalTree.getRoot().left.key);
	}
	
	@Test
	public void searchMinOverlapInterval() throws Exception {
		RBNode node=intervalTree.searchMinInterval(new Interval(7, 8));
		assertEquals(5, node.key);
	}
	
	@Test
	public void findAllOverlaps() throws Exception {
		List<RBNode> nodes = intervalTree.findAllOverlaps(new Interval(7, 8));
		assertEquals(3, nodes.size());
	}
	
	
	@Test
	public void searchMinOverlapIntervalRightSide() throws Exception {
		RBNode node=intervalTree.searchMinInterval(new Interval(26, 26));
		assertEquals(26, node.key);
	}
	
	@Test
	public void exactSearch() throws Exception {
		RBNode node = intervalTree.exactSearch(new Interval(19, 20));
		assertEquals(19, node.key);
	}
	
	@Test
	public void exactSearchNonExisting() throws Exception {
		RBNode node = intervalTree.exactSearch(new Interval(19, 30));
		assertEquals(-1, node.key);
	}
	

	private RBNode getNode(RBNode nillNode, int low, int high) {
		RBNode node = new RBNode(low, nillNode, nillNode, nillNode,
				RBNode.RED_COLOR);
		Interval interval = new Interval(low, high);
		node.interval = interval;
		return node;
	}

}
