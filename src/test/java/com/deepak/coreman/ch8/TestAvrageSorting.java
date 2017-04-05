package com.deepak.coreman.ch8;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestAvrageSorting {

	private AvrageSorting avrageSorting;

	@Before
	public void init() {
		avrageSorting = new AvrageSorting();

	}

	@Test
	public void testSort() {
		int array[] = { 2, 8, 7, 1, 3, 5, 6, 0 };
		avrageSorting.sort(array, 3);
		ArrayHelper.printArray(array);
	}
	
	@Test
	public void testSort2() {
		int array[] = {2, 6, 3, 12, 56, 8};
		avrageSorting.sort(array, 2);
		ArrayHelper.printArray(array);
	}
	

}
