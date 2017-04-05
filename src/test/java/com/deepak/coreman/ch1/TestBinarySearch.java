package com.deepak.coreman.ch1;

import org.junit.Test;

public class TestBinarySearch {

	private BinarySerach search = new BinarySerach();

	@Test
	public void testCase1() {
		int array[] = { 1, 2, 5, 5, 7, 9 };
		System.out.println(search.search(array, 7));
	}
	
	@Test
	public void testCase2() {
		int array[] = { 1, 2, 5, 5, 7, 9 };
		System.out.println(search.search(array, 6));
	}

}
