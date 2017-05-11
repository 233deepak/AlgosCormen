package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestCountChange {

	private CoinExchanger exchanger;

	@Before
	public void setup() throws Exception {
		exchanger = new CoinExchanger();
	}

	@Test
	public void testExchangeNoCents() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		int ways = exchanger.countPossibleExchanges(0, s.length - 1);
		assertEquals(1, ways);
	}

	@Test
	public void exchange1Cents() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		exchanger.setCoins(s);
		int ways = exchanger.countPossibleExchanges(1, s.length - 1);
		assertEquals(0, ways);
	}

	@Test
	public void exchange10Cents() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		exchanger.setCoins(s);
		int ways = exchanger.countPossibleExchanges(10, s.length - 1);
		assertEquals(5, ways);
	}

	@Test
	public void exchange4Cents() throws Exception {
		int s[] = { 1, 2, 3 };
		exchanger.setCoins(s);
		int ways = exchanger.countPossibleExchanges(4, s.length - 1);
		assertEquals(4, ways);
	}

	@Test
	public void exchange100Cents() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		exchanger.setCoins(s);
		int ways = exchanger.countPossibleExchanges(100, s.length - 1);
		assertEquals(1163, ways);
	}

	@Test @Ignore
	public void exchange1000Cents() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		exchanger.setCoins(s);
		int ways = exchanger.countPossibleExchanges(1000, s.length - 1);
		assertEquals(948293, ways);
	}

	@Test
	public void exchangeWithMinCoins0Cents() throws Exception {
		int s[] = { 1, 2, 5 };
		exchanger.setCoins(s);
		int ways = exchanger.countMinNoOfCoins(0, s.length - 1);
		assertEquals(0, ways);
	}
	
	@Test
	public void exchangeWithMinCoins2Cents() throws Exception {
		int s[] = { 1, 2, 5 };
		exchanger.setCoins(s);
		int ways = exchanger.count(2, s.length - 1);
		assertEquals(1, ways);
	}
	
	@Test
	public void exchangeWithMinCoins11Cents() throws Exception {
		int s[] = { 1, 2, 5 };
		exchanger.setCoins(s);
		int ways = exchanger.count(11, s.length - 1);
		assertEquals(3, ways);
	}
	
	@Test
	public void exchangeWhenNotPossibleToExchange() throws Exception {
		int s[] = { 2, 6 };
		exchanger.setCoins(s);
		int ways = exchanger.count(7, s.length - 1);
		assertEquals(-1, ways);
	}

}
