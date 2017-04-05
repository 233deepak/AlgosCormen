package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

public class TestStackUsingList {

	private StackUingSingleList stack;

	@Before
	public void init() {
		stack = new StackUingSingleList();
	}

	@Test
	public void testPush() {
		stack.push(2);
		stack.push(0);
		stack.push(3);
		stack.push(1);
		stack.push(5);
	}

	@Test
	public void pop() {
		stack.push(2);
		stack.push(0);
		stack.push(3);
		stack.push(1);
		stack.push(5);
		System.out.println(stack.pop());

	}

}
