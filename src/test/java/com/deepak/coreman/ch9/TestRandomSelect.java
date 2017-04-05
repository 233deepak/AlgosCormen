package com.deepak.coreman.ch9;

import org.junit.Before;
import org.junit.Test;

public class TestRandomSelect {
	
	private RandomSelect randomSelect;
	
	@Before
	public void init(){
		randomSelect =new RandomSelect();
	}

	@Test
	public void test(){
		int array[] = { 1, 3, 5, 2, 0, 7, 6, 8 };
        System.out.println(randomSelect.selectRandom(array, 6));		
	}
	
	@Test
	public void test1(){
		int array[] = { 1, 3, 5, 2, 0, 7, 6, 8 };
        System.out.println(randomSelect.selectRandom(array, 3));		
	}
}
