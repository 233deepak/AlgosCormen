package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.NodeHelper;

public class SetUnionTest {

	private SetOperation setOperation;

	@Before
	public void testCreate() {
		setOperation = new SetOperation();
	}

	@Test
	public void performUnion() {
		LinkedList linkedList1 = new DoubleLinkedList();
		linkedList1.insertAtBegning(2);
		linkedList1.insertAtBegning(0);
		linkedList1.insertAtBegning(3);
		linkedList1.insertAtBegning(1);
		linkedList1.insertAtBegning(5);
		NodeHelper.printAllElement(linkedList1.getRoot());
		LinkedList linkedList2 = new DoubleLinkedList();
		linkedList2.insertAtBegning(2);
		linkedList2.insertAtBegning(0);
		linkedList2.insertAtBegning(3);
		linkedList2.insertAtBegning(1);
		linkedList2.insertAtBegning(5);
		NodeHelper.printAllElement(linkedList2.getRoot());
		Node root = setOperation.union(linkedList1, linkedList2);
		NodeHelper.printAllElement(root);
		// Assert.assertEquals(10, actual);
	}

}
