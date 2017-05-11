package com.deepak.coreman.common;

import java.util.List;

public class ArrayHelper {

	public static void printArray(int[] array) {
		// System.out.println("shh");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void printArray(int[][] array) {
		// System.out.println("shh);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	
	public static <T> void printList(List<T> list) {
		for (T t : list) {
			System.out.println(t);
		}

	}

}
