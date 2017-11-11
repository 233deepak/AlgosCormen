package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMinCoinExchange {

	private CoinExchangeMinimizer exchangeMinimizer;

	@Before
	public void setup() {
		exchangeMinimizer = new CoinExchangeMinimizer();
	}

	@Test
	public void exchange0With1coin() throws Exception {
		int[] availableCoins = { 25, 10, 5 };
		exchangeMinimizer.setCoins(availableCoins);
		int count = exchangeMinimizer.exchange(0);
		assertEquals(0, count);
	}

	@Test
	public void exchange5With1coin() throws Exception {
		int[] availableCoins = { 25, 10, 5 };
		exchangeMinimizer.setCoins(availableCoins);
		int count = exchangeMinimizer.exchange(5);
		assertEquals(1, count);
	}
	
	@Test
	public void exchange30With3coin() throws Exception {
		int[] availableCoins = { 25, 10, 5 };
		exchangeMinimizer.setCoins(availableCoins);
		int count = exchangeMinimizer.exchange(30);
		assertEquals(2, count);
	}

}
