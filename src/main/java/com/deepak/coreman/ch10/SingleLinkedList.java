package com.deepak.coreman.ch10;

import org.junit.Assert;

public class SingleLinkedList implements LinkedList {

	private Node nill;
	private Node tail;

	public SingleLinkedList() {
		nill = new Node(-1, null);
		tail = nill;
	}

	public void insertAtBegning(int key) {
		Node node = new Node(key, null);
		Node temp = nill.next;
		nill.next = node;
		node.next = temp;
		tail = temp;
		printState();
	}

	private void printState() {
		System.out.println(nill);
	}

	public int deleteFromEnd() {
		Node temp = nill;
		Node prev = nill;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		printState();
		return temp.x;
	}

	public void search(int key) {
		Node temp = nill;
		while (temp.next != null) {
			if (temp.x == key) {
				System.out.println("found");
				break;
			}
			temp = temp.next;
		}
		printState();

	}

	public int deleteFromBegning() {
		Node temp = nill.next;
		Assert.assertNotNull(temp.next);
		int x = temp.x;
		nill.next = temp.next;
		printState();
		return x;
	}

	public void deleteInO1Time() {

	}

	public Node getRoot() {
		return nill;
	}

	public Node reverse() {
		LinkedList list = new SingleLinkedList();
		Node temp = nill.next;
		while (temp != null) {
			list.insertAtBegning(temp.getX());
			temp = temp.next;
		}
		return list.getRoot();
	}
}
