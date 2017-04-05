package com.deepak.coreman.ch6;

import org.junit.Before;
import org.junit.Test;

public class TestFIFOQueue {

	private FIFOQueue<Job> quque;

	@Before
	public void init() {
		quque = new FIFOQueue<Job>();
	}
	
	@Test
	public void testInsert(){
		Job jobA =new Job("A");
		Job jobB =new Job("B");
		Job jobC =new Job("C");
		Job jobD =new Job("D");
		Job jobE =new Job("E");
		quque.enqueue(jobA);
		quque.enqueue(jobB);
		quque.enqueue(jobC);
		quque.enqueue(jobD);
		quque.enqueue(jobE);
		System.out.println(quque);
		
	}
	

}
