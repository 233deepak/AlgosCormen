package com.deepak.coreman.ch10;

public class DoubleLinkedList implements LinkedList {

	private Node nill;

	public DoubleLinkedList() {
		nill = new Node(-1, null);
		nill.next = nill;
		nill.prev = nill;
	}

	public void insertAtBegning(int key) {
		Node node = new Node(key, null);
		Node temp = nill.next;
		nill.next = node;
		node.prev = nill;
		node.next = temp;
		temp.prev = node;

	}

	public int deleteFromEnd() {
		Node temp = nill.prev;
		nill.prev = temp.prev;
		temp.prev.next = nill;
		return temp.x;
	}

	public void search(int key) {
		// TODO Auto-generated method stub

	}

	public int deleteFromBegning() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteInO1Time() {
		// TODO Auto-generated method stub

	}

	public Node getNill() {
		return nill;
	}

	public void setNill(Node nill) {
		this.nill = nill;
	}

	public Node getRoot() {
		// TODO Auto-generated method stub
		return nill;
	}

	public Node reverse() {
		Node root = new Node(-1, null);
		root.next = root;
		root.prev = root;
		
		

		return null;
	}

}
