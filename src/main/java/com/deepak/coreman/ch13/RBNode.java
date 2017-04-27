package com.deepak.coreman.ch13;

public class RBNode {
	public static final String RED_COLOR ="R";
	public static final String BLACK_COLOR ="B";
	
	
	public int key;
	public RBNode left;
	public RBNode right;
	public RBNode parent;
	public String colour;
	public int size;
	
	public Interval  interval;
	public int max;
	
	
	public RBNode(int key, String colour) {
		super();
		this.key = key;
		this.colour = colour;
	}

	public RBNode(int key, RBNode left, RBNode right, RBNode parent,
			String colour) {
		super();
		this.key = key;
		this.left = left;
		this.right = right;
		this.parent = parent;
		this.colour = colour;
	}
	
	
	
	
	

}
