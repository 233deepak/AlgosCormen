package com.deepak.coreman.ch10;

public interface LinkedList {

	public void insertAtBegning(int key);

	public int deleteFromEnd();

	public void search(int key);

	public int deleteFromBegning();
	
	public void deleteInO1Time();
	
	public Node getRoot();

	public Node reverse();

}
