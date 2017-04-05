package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

public class TestTwoStack {
	
	private TwoStackUsingArray twoStack;

	@Before
	public void init() {
		twoStack= new TwoStackUsingArray();
	}

	@Test
	public void testCase() {
		twoStack.push1(4);
		twoStack.push1(1);
		twoStack.push1(3);
		twoStack.pop1();
		twoStack.push1(8);
		twoStack.pop1();
		
		twoStack.push2(4);
		twoStack.push2(1);
		twoStack.push2(3);
		twoStack.pop2();
		twoStack.push2(8);
		twoStack.pop2();

	}

}
