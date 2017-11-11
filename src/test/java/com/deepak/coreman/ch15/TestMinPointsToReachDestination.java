package com.deepak.coreman.ch15;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestMinPointsToReachDestination {

	private MinPoints minPoints;

	@Before
	public void setup() {
		minPoints = new MinPoints();
	}

	@Test
	public void gridWithEmptyData() throws Exception {

		int[][] array = new int[][] {};
		int minPoint = minPoints.findMinPointsrequired(array);
		assertEquals(0, minPoint);

	}

	@Test
	public void gridWithSingleRow() throws Exception {

		int[][] array = new int[][] { { -2, -3, 3 } };
		int minPoint = minPoints.findMinPointsrequired(array);
		assertEquals(6, minPoint);

	}

	@Test
	public void gridWithSingleColumn() throws Exception {

		int[][] array = new int[][] { { -2 }, { -3 }, { 3 } };
		int minPoint = minPoints.findMinPointsrequired(array);
		assertEquals(6, minPoint);

	}

	@Test
	public void gridWithSingleRowWithAllPositive() throws Exception {

		int[][] array = new int[][] { { 2, 3, 3 } };
		int minPoint = minPoints.findMinPointsrequired(array);
		assertEquals(1, minPoint);

	}

	@Test
	public void gridWith3X3Grid() throws Exception {

		int[][] array = new int[][] { { -2, -3, 3 }, { -5, -10, 1 },
				{ 10, 30, -5 } };
		int minPoint = minPoints.findMinPointsrequired(array);
		assertEquals(7, minPoint);

	}

}
