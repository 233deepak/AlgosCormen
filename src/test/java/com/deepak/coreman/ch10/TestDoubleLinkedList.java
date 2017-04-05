package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.NodeHelper;

public class TestDoubleLinkedList {

	private DoubleLinkedList doubleLinkedList;

	@Before
	public void init() {
		doubleLinkedList = new DoubleLinkedList();
	}

	@Test
	public void testInsert() {
		doubleLinkedList.insertAtBegning(2);
		doubleLinkedList.insertAtBegning(0);
		doubleLinkedList.insertAtBegning(3);
		doubleLinkedList.insertAtBegning(1);
		doubleLinkedList.insertAtBegning(5);
		NodeHelper.printNode(doubleLinkedList.getNill());
	}
	
	@Test
	public void testDelete() {
		doubleLinkedList.insertAtBegning(2);
		doubleLinkedList.insertAtBegning(0);
		doubleLinkedList.insertAtBegning(3);
		doubleLinkedList.insertAtBegning(1);
		doubleLinkedList.insertAtBegning(5);
		NodeHelper.printNode(doubleLinkedList.getNill());
		System.out.println(doubleLinkedList.deleteFromEnd());
		NodeHelper.printNode(doubleLinkedList.getNill());
	}
	
	@Test
	public void testReverse(){
		
		Node root=doubleLinkedList.reverse();
	}
	

}
