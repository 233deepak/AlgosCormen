package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

public class TestStack {

	private Stack stack;

	@Before
	public void init() {
		stack = new Stack();
	}

	@Test
	public void testCase() {
		stack.push(4);
		stack.push(1);
		stack.push(3);
		stack.pop();
		stack.push(8);
		stack.pop();

	}

}
