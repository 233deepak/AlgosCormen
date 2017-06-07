package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.ch12.BNode;

public class TestLIndependentSet {

	private LIndependentSet independentSet;

	@Before
	public void setup() {
		independentSet = new LIndependentSet();
	}

	@Test
	public void treeHavingleafNodes() throws Exception {
		BNode bNode = new BNode(70);
		int length = independentSet.maxLength(bNode);
		assertEquals(1, length);
	}

	@Test
	public void treeHavingNoGrandChildNodes() throws Exception {
		BNode bNode30 = new BNode(30);
		BNode bNode60 = new BNode(30);
		bNode30.setRight(bNode60);
		int length = independentSet.maxLength(bNode30);
		assertEquals(1, length);
	}
	
	@Test
	public void treeHavingHeight3() throws Exception {
		BNode bNode20 = new BNode(20);
		BNode bNode40 = new BNode(40);
		BNode bNode50 = new BNode(50);
		BNode bNode70 = new BNode(70);
		BNode bNode80 = new BNode(80);
		bNode20.setLeft(bNode40);
		bNode20.setRight(bNode50);
		bNode50.setLeft(bNode70);
		bNode50.setRight(bNode80);

		int length = independentSet.maxLength(bNode20);
		assertEquals(3, length);
	}
}
