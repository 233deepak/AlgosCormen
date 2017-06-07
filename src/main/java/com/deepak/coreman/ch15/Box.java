package com.deepak.coreman.ch15;

public class Box {

	int height;
	int width;
	int depth;

	public Box(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

	@Override
	public String toString() {
		return "Box [ "+ height + "," + width + ","
				+ depth + "]";
	}

}
