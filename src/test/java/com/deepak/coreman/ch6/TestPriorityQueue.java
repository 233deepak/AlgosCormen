package com.deepak.coreman.ch6;

import org.junit.Before;
import org.junit.Test;

public class TestPriorityQueue {

	private PriortyQueue priortyQueue;

	@Before
	public void init() {
		priortyQueue = new PriortyQueue(new int[] { 4, 1, 3, 2, 16, 9, 10, 14,
				8, 7 });
	}

	@Test
	public void testCreatePriorityQueue() {
		priortyQueue = new PriortyQueue(new int[] { 4, 1, 3, 2, 16, 9, 10, 14,
				8, 7 });
		System.out.println(priortyQueue);
	}
	
	@Test
	public void testGetMax(){
		System.out.println(priortyQueue.getMax());
	}
	
	@Test
	public void testExtractMax(){
		System.out.println(priortyQueue);
		System.out.println(priortyQueue.extractMax());
		System.out.println(priortyQueue);
		System.out.println(priortyQueue.extractMax());
		System.out.println(priortyQueue);
		
	}
	
	@Test
	public void testIncreaseKey(){
		priortyQueue.increaseKey(8, 15);
		System.out.println(priortyQueue);
	}
	
	@Test
	public void testInsert(){
		priortyQueue.insert(28);
		System.out.println(priortyQueue);
	}

}
