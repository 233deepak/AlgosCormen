package com.deepak.coreman.ch4;

import java.util.Random;

import org.junit.Test;

public class TestMaxSubArray {

	private ProfitMaximizer maximizer = new ProfitMaximizer();
	private BruteForceMaximizer maximizerBruteForce = new BruteForceMaximizer();
	private LinearTimeSubArray linearSuubArray = new LinearTimeSubArray();

	@Test
	public void testMaxSubArray() {
		int[] array = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22,
				15, -4, 7 };
		ProfitDuration maxProfit = maximizer.findMaxSubArrray(array);
		System.out.println("MaxSubarray is ( " + maxProfit.low + ","
				+ maxProfit.high + ") and profit is" + maxProfit.profit);

	}

	@Test
	public void testMaxSubArrayCase2() {
		int[] array = { -2, -5, 6, -2, -3, 1, 5, -6 };
		ProfitDuration maxProfit = maximizer.findMaxSubArrray(array);
		System.out.println("MaxSubarray is ( " + maxProfit.low + ","
				+ maxProfit.high + ") and profit is" + maxProfit.profit);

	}

	@Test
	public void testMaxSubArrayCase3() {
		int[] array = { -2, -3, 4, -1, -2, 1, 5, -3 };
		ProfitDuration maxProfit = maximizer.findMaxSubArrray(array);
		System.out.println("MaxSubarray is ( " + maxProfit.low + ","
				+ maxProfit.high + ") and profit is" + maxProfit.profit);

	}

	@Test
	public void testMaximizeProfit() {
		int array[] = { 100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106,
				101, 79, 94, 90, 97 };
		ProfitDuration maxProfit = maximizer.maximizeProfit(array);
		System.out.println("MaxSubarray is ( " + (maxProfit.low + 1) + ","
				+ (maxProfit.high + 1) + ") and profit is" + maxProfit.profit);
	}

	@Test
	public void testBruteForce() {
		int[] array = { -2, -5, 6, -2, -3, 1, 5, -6 };
		System.out.println(maximizerBruteForce.findMaxSubarraySum(array));
	}

	@Test
	public void testBruteForce2() {
		int[] array = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22,
				15, -4, 7 };
		System.out.println(maximizerBruteForce.findMaxSubarraySum(array));
	}

	@Test
	public void testBruteForce3() {
		int[] array = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22,
				15, -4, 7 };
		System.out.println(maximizerBruteForce.findMaxSubArray(array));
	}

	@Test
	public void testBruteForceLargeVolume() {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt();
		}
		System.out.println(maximizerBruteForce.findMaxSubArray(array));
	}

	@Test
	public void testMaximizer() {
		int[] array = new int[100000];
		Random random = new Random();
		for (int i = 0; i < 100000; i++) {
			array[i] = random.nextInt();
		}
		ProfitDuration maxProfit = maximizer.findMaxSubArrray(array);
		System.out.println("MaxSubarray is ( " + maxProfit.low + ","
				+ maxProfit.high + ") and profit is" + maxProfit.profit);
	}

	@Test
	public void testBruteForceLargeVolume100() {
		int[] array = new int[10000];
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			array[i] = random.nextInt();
		}
		System.out.println(maximizerBruteForce.findMaxSubArray(array));
	}

	@Test
	public void testMaximize100() {
		int[] array = new int[10000];
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			array[i] = random.nextInt();
		}
		ProfitDuration maxProfit = maximizer.findMaxSubArrray(array);
		System.out.println("MaxSubarray is ( " + maxProfit.low + ","
				+ maxProfit.high + ") and profit is" + maxProfit.profit);
	}

	@Test
	public void testLinear() {
		int[] array = { -2, -5, 6, -2, -3, 1, 5, -6 };
		System.out.println(linearSuubArray.findMaxSubArray(array));
	}

	@Test
	public void testLinear2() {
		int[] array = { 13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22,
				15, -4, 7 };
		System.out.println(linearSuubArray.findMaxSubArray(array));
	}
}
