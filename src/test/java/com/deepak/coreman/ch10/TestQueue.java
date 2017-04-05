package com.deepak.coreman.ch10;

import org.junit.Before;
import org.junit.Test;

public class TestQueue {
	
	private Queue queue;
	
	@Before
	public void init() {
		queue=new Queue();
	}
	
	@Test
	public void test(){
		queue.enqueue(4);
		queue.enqueue(1);
		queue.enqueue(3);
		queue.dequeue();
		queue.enqueue(8);
		queue.dequeue();
	}

}
