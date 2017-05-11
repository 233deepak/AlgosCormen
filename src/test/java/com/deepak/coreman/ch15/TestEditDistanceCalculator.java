package com.deepak.coreman.ch15;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEditDistanceCalculator {

	private EditDistanceCalculator distanceCalculator;

	@Before
	public void setup() throws Exception {
       distanceCalculator =new EditDistanceCalculator();
	}

	@Test
	public void testForEditDistance1() throws Exception {
		int dist = distanceCalculator.editDistance("geek", "gesek");
		assertEquals(1, dist);
	}
	
	@Test
	public void testForEditDistance2() throws Exception {
		int dist = distanceCalculator.editDistance("cat", "cut");
		assertEquals(1, dist);
	}
	
	@Test
	public void editDistance3() throws Exception {
		int dist = distanceCalculator.editDistance("sunday", "saturday");
		assertEquals(3, dist);
	}
	
	@Test
	public void editDistance80() throws Exception {
		int dist = distanceCalculator.editDistance("lrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmcoq", "hnwnkuewhsqmgbbuqcljjivswmdkqtbxixmvtrrbljptnsnfwzqfjmafadrrwsofsbcnuvqhffbsaqxwpqcaceh");
		assertEquals(78, dist);
	}
	
	@Test
	public void editDistanceWithSecondZero() throws Exception {
		int dist = distanceCalculator.editDistance("gkbbipzzrzucxamludfykgruowzgio", "o");
		assertEquals(29, dist);
	}
	
	 

}
