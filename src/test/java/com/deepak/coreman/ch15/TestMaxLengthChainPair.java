package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestMaxLengthChainPair {

	private MaxChainLenghtPair maxChainLength;
	
	@Before
	public void setup(){
		maxChainLength =new MaxChainLenghtPair();
	}

	@Test
	public void maxChainLenghtWitOnePair() throws Exception {
		Pair pair = new Pair(5, 24);
		List<Pair> pairs = new ArrayList<Pair>();
		pairs.add(pair);
		int maxLength = maxChainLength.findMaxChainLength(pairs);
		assertEquals(1, maxLength);
	}
	

	@Test
	public void maxChainLenghtWit5Pair() throws Exception {
		Pair pair1 = new Pair(5, 24);
		Pair pair2 = new Pair(30, 60);
		Pair pair3 = new Pair(15, 28);
		Pair pair4 = new Pair(50, 90);
		Pair pair5 = new Pair(27, 40);
		List<Pair> pairs = new ArrayList<Pair>();
		pairs.add(pair1);
		pairs.add(pair2);
		pairs.add(pair3);
		pairs.add(pair4);
		pairs.add(pair5);
		int maxLength = maxChainLength.findMaxChainLength(pairs);
		assertEquals(3, maxLength);
	}

}
