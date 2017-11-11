package com.deepak.coreman.ch15.hackerrank;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCoinChange {

	private CoinChanger coinChanger;

	@Before
	public void setUp() {
		coinChanger = new CoinChanger();
	}

	@Test
	public void changeZeroValue() throws Exception {
		int[] coins = { 8, 3, 1, 2 };
		coinChanger.setCoins(coins);
		int ways = coinChanger.exchange(0);
		assertEquals(1, ways);

	}

	@Test
	public void changeNegativeValue() throws Exception {
		int[] coins = { 8, 3, 1, 2 };
		coinChanger.setCoins(coins);
		int ways = coinChanger.exchange(-1);
		assertEquals(0, ways);
	}

	@Test
	public void change1() throws Exception {
		int[] coins = { 8, 3, 1, 2 };
		coinChanger.setCoins(coins);
		int ways = coinChanger.exchange(1);
		assertEquals(1, ways);

	}

	@Test
	public void change3() throws Exception {
		int[] coins = { 8, 3, 1, 2 };
		coinChanger.setCoins(coins);
		int ways = coinChanger.exchange(3);
		assertEquals(3, ways);

	}

	@Test
	public void exchangeWithMinCoins4Cents() throws Exception {
		int s[] = { 1, 2, 3 };
		coinChanger.setCoins(s);
		int ways = coinChanger.exchange(4);
		assertEquals(4, ways);
	}
	
	@Test
	public void change100() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		coinChanger.setCoins(s);
		int ways = coinChanger.exchange(100);
		assertEquals(1163, ways);
	}
	
	@Test
	public void change1000() throws Exception {
		int s[] = { 2, 3, 5, 6 };
		coinChanger.setCoins(s);
		int ways = coinChanger.exchange(1000);
		assertEquals(948293, ways);
		
	}
	

}
