package com.deepak.coreman.ch10;

public class SetOperation {

	public Node union(LinkedList linkedList1, LinkedList linkedList2) {
		Node root1 = linkedList1.getRoot();
		Node root2 = linkedList2.getRoot();
		root1.prev.next = root2.next;
		root2.next.prev = root1.prev;
		return root1;

	}

}
