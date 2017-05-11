package com.deepak.coreman.ch15;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestRodCutting {

	private RodCutter rodCutter;

	@Before
	public void setup() throws Exception {
		int price[] = new int[] { 1, 5, 8, 9, 10, 17, 20, 24, 30, 56 };
		rodCutter = new RodCutter();
		rodCutter.setPrices(price);
	}

	@Test
	public void rodOflength0() throws Exception {
		int maxPrice = rodCutter.cutRodOfLength(0);
		assertEquals(0, maxPrice);
	}

	@Test
	public void rodWithLength1() throws Exception {
		int maxPrice = rodCutter.cutRodOfLength(1);
		assertEquals(1, maxPrice);
	}

	@Test
	public void rodWithLength2() throws Exception {
		int maxPrice = rodCutter.cutRodOfLength(2);
		assertEquals(5, maxPrice);
	}

	@Test
	public void rodWithLength3() throws Exception {
		int maxPrice = rodCutter.cutRodOfLength(3);
		assertEquals(8, maxPrice);
	}

	@Test
	public void rodWithLength4() throws Exception {
		int maxPrice = rodCutter.cutRodOfLength(4);
		assertEquals(10, maxPrice);
	}

	@Test
	public void rodWithLength4WithDp() throws Exception {
		OptimalRodCutting optimal = rodCutter.cutRodWithRememberingPrice(4);
		assertEquals(10, optimal.maxPrice);
	}

	@Test
	public void rodWithLength4WithDpWithselectedLenghts() throws Exception {
		OptimalRodCutting optimal = rodCutter.cutRodWithRememberingPrice(4);
		assertEquals(10, optimal.maxPrice);
		assertArrayEquals(new int[] { 1, 2, 3, 2}, optimal.diffLengths);
		List<Integer> rods =rodCutter.getRods(optimal.diffLengths);
		assertEquals(2, rods.size());
	}
	
	@Test
	public void rodWithLength4WithDpIncludingCuttingCost() throws Exception {
		rodCutter.setCuttingCost(2);
		OptimalRodCutting optimal = rodCutter.cutRodWithRememberingPrice(4);
		assertEquals(6, optimal.maxPrice);
		assertArrayEquals(new int[] { 1, 2, 3, 2}, optimal.diffLengths);
		List<Integer> rods =rodCutter.getRods(optimal.diffLengths);
		assertEquals(2, rods.size());
	}

	@Test
	public void rodWithLength40DP() throws Exception {
		int[] price = new int[80];
		for (int i = 0; i < 80; i++) {
			price[i] = i;
		}
		rodCutter.setPrices(price);
		OptimalRodCutting optimal = rodCutter.cutRodWithRememberingPrice(40);
		assertEquals(39, optimal.maxPrice);
	}

}
