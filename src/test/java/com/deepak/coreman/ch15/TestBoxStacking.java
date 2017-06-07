package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestBoxStacking {

	private BoxStacker boxStacker;

	@Before
	public void setUp() {
		boxStacker = new BoxStacker();
	}

	@Test
	public void maxStackHeight() throws Exception {
		Box box1 = new Box(4, 6, 7);
		Box box2 = new Box(1, 2, 3);
		Box box3 = new Box(4, 5, 6);
		Box box4 = new Box(10, 12, 32);

		List<Box> boxs = new ArrayList<Box>();
		boxs.add(box1);
		boxs.add(box2);
		boxs.add(box3);
		boxs.add(box4);

		boxStacker.setBoxes(boxs);
		int max = boxStacker.maximizeHeight();
		assertEquals(60, max);
	}

}
