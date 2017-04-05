package com.deepak.coreman.ch10;

public class LinkedListWithArray {

	private int[][] array;
	private int freeLoc;
	private int listLoc;
	public static final int NO_OF_FIELD = 3;
	public static final int AVAILABLE_SPACE = 9;

	public static final int NEXT_INDEX = 0;
	public static final int PREV_INDEX = 2;
	public static final int ELEMENT = 1;

	public LinkedListWithArray() {
		array = new int[NO_OF_FIELD][AVAILABLE_SPACE];
	}

	public int getFreeLoc() {
		return freeLoc;
	}

	public int getListLoc() {
		return listLoc;
	}

	public void initialize() {
		freeLoc = 0;
		for (int i = 0; i < AVAILABLE_SPACE - 1; i++) {
			array[0][i] = i + 1;
		}
		array[0][AVAILABLE_SPACE - 1] = -1;
		for (int i = 1; i < NO_OF_FIELD; i++)
			for (int j = 0; j < AVAILABLE_SPACE; j++)
				array[i][j] = -1;
		listLoc = -1;

	}

	public int[][] currentState() {
		return array;
	}

	public int allocateObject() {
		if (freeLoc == -1)
			throw new RuntimeException("out of space");
		int allocatedLoc = freeLoc;
		freeLoc = array[NEXT_INDEX][freeLoc];
		return allocatedLoc;
	}

	public void freeObject(int index) {
		array[NEXT_INDEX][index] = freeLoc;
		freeLoc = index;

	}

	public void add(int element) {
		int loc = allocateObject();
		array[NEXT_INDEX][loc] = -1;
		array[PREV_INDEX][loc] = listLoc;
		array[ELEMENT][loc] = element;
		if (listLoc >= 0)
			array[NEXT_INDEX][listLoc] = loc;
		listLoc = loc;
	}

	public void remove(int element) {
		int index = 0;
		for (; index < AVAILABLE_SPACE; index++) {
			if (array[ELEMENT][index] == element)
				break;
		}

		freeObject(index);
		listLoc = array[PREV_INDEX][index];
		array[PREV_INDEX][index] = -1;
		array[ELEMENT][index] = -1;

	}
}
