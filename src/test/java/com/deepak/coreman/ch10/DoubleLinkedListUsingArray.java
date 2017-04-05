package com.deepak.coreman.ch10;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DoubleLinkedListUsingArray {

	private LinkedListWithArray listWithArray;

	@Before
	public void setup() {
		listWithArray = new LinkedListWithArray();
		listWithArray.initialize();
	}

	private void populateList() {
		listWithArray.add(13);
		listWithArray.add(4);
		listWithArray.add(8);
		listWithArray.add(19);
		listWithArray.add(5);
		listWithArray.add(11);
	}

	@Test
	public void nothing() {
		System.out.println();
	}

	@Test
	public void initializeList() {
		int freeLoc = listWithArray.getFreeLoc();
		int listLoc = listWithArray.getListLoc();
		int[][] array = listWithArray.currentState();
		assertEquals(0, freeLoc);
		assertEquals(-1, listLoc);
		assertArrayEquals(new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, -1 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1 } }, array);

	}

	@Test
	public void allocateObject() {
		listWithArray.allocateObject();
		assertEquals(1, listWithArray.getFreeLoc());

	}

	@Test
	public void outOfSpace() {
		String msg = "";
		for (int i = 0; i < 9; i++)
			listWithArray.allocateObject();
		try {
			listWithArray.allocateObject();
		} catch (Exception e) {
			msg = e.getMessage();
		}
		assertEquals("out of space", msg);
	}

	@Test
	public void freeObject() {
		listWithArray.allocateObject();
		listWithArray.freeObject(0);
		assertEquals(0, listWithArray.getFreeLoc());
	}

	@Test
	public void addToList() {
		listWithArray.add(13);
		assertEquals(1, listWithArray.getFreeLoc());
		assertEquals(0, listWithArray.getListLoc());
		assertArrayEquals(new int[][] { { -1, 2, 3, 4, 5, 6, 7, 8, -1 },
				{ 13, -1, -1, -1, -1, -1, -1, -1, -1 },
				{ -1, -1, -1, -1, -1, -1, -1, -1, -1 } },
				listWithArray.currentState());
	}

	@Test
	public void addMultipleToList() {
		populateList();
		assertEquals(6, listWithArray.getFreeLoc());
		assertEquals(5, listWithArray.getListLoc());
		assertArrayEquals(new int[][] { { 1, 2, 3, 4, 5, -1, 7, 8, -1 },
				{ 13, 4, 8, 19, 5, 11, -1, -1, -1 },
				{ -1, 0, 1, 2, 3, 4, -1, -1, -1 } },
				listWithArray.currentState());
	}

	@Test
	public void removeToList() {
		populateList();
		listWithArray.remove(8);
		assertEquals(2, listWithArray.getFreeLoc());
		assertEquals(1, listWithArray.getListLoc());
		assertArrayEquals(new int[][] { { 1, 2, 6, 4, 5, -1, 7, 8, -1 },
				{ 13, 4, -1, 19, 5, 11, -1, -1, -1 },
				{ -1, 0, -1, 2, 3, 4, -1, -1, -1 } },
				listWithArray.currentState());

	}

}
