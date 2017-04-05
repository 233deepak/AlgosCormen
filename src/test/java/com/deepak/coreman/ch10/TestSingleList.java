package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.NodeHelper;

public class TestSingleList {

	private LinkedList linkedList;

	@Before
	public void init() {
		linkedList = new SingleLinkedList();
	}

	@Test
	public void testInsert() {
		linkedList.insertAtBegning(2);
		linkedList.insertAtBegning(0);
		linkedList.insertAtBegning(3);
		linkedList.insertAtBegning(1);
		linkedList.insertAtBegning(5);

	}

	@Test
	public void testDelete() {
		linkedList.insertAtBegning(2);
		linkedList.insertAtBegning(0);
		linkedList.insertAtBegning(3);
		linkedList.insertAtBegning(1);
		linkedList.insertAtBegning(5);
		linkedList.deleteFromEnd();
	}

	@Test
	public void testSearch() {
		linkedList.insertAtBegning(2);
		linkedList.insertAtBegning(0);
		linkedList.insertAtBegning(3);
		linkedList.insertAtBegning(1);
		linkedList.insertAtBegning(5);
		linkedList.search(3);
	}
	
	@Test
	public void testDeleteFromFront() {
		linkedList.insertAtBegning(2);
		linkedList.insertAtBegning(0);
		linkedList.insertAtBegning(3);
		linkedList.insertAtBegning(1);
		linkedList.insertAtBegning(5);
		linkedList.deleteFromBegning();
	}
	
	@Test
	public void testReverse() {
		linkedList.insertAtBegning(2);
		linkedList.insertAtBegning(0);
		linkedList.insertAtBegning(3);
		linkedList.insertAtBegning(1);
		linkedList.insertAtBegning(5);
		Node root =linkedList.reverse();
		NodeHelper.printNode(root);
		
	}
}
