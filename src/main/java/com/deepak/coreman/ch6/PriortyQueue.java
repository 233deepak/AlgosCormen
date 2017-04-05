package com.deepak.coreman.ch6;

import java.util.ArrayList;
import java.util.List;

public class PriortyQueue {

	private List<Integer> list;
	private int heapSize;

	public PriortyQueue() {
		list = new ArrayList<Integer>();
		heapSize = 0;
	}

	public PriortyQueue(int[] array) {
		list = new ArrayList<Integer>();
		heapSize = 0;
		buildMaxHeap(array);
	}

	private void buildMaxHeap(int[] array) {
		for (int index = 0; index < array.length; index++) {
			list.add(array[index]);
		}
		heapSize = list.size();
		for (int index = ((array.length) / 2) - 1; index >= 0; index--) {
			maxHeapify(list, index);
		}

	}

	private void maxHeapify(List<Integer> list, int index) {
		if (index > (heapSize) / 2)
			return;
		int left = (2 * index) + 1;
		int right = (2 * index) + 2;
		if (right >= list.size()) {
			if (list.get(left) > list.get(index)) {
				int temp = list.get(index);
				list.set(index, list.get(left));
				list.set(left, temp);
			}
			return;
		}
		if (list.get(index) < list.get(left)
				|| list.get(index) < list.get(right)) {
			int max = (list.get(left) > list.get(right)) ? left : right;
			int temp = list.get(index);
			list.set(index, list.get(max));
			list.set(max, temp);
			maxHeapify(list, max);
		}
	}

	public Integer getMax() {
		return list.get(0);
	}

	public Integer extractMax() {
		if (heapSize < 1) {
			System.out.println("heap underflow");
		}
		Integer max = list.get(0);
		list.set(0, list.get(heapSize - 1));
		list.set(heapSize - 1, max);
		heapSize--;
		maxHeapify(list, 0);
		return max;
	}

	public void increaseKey(int index, Integer key) {
		if (key < list.get(index)) {
			System.out.println("Key is smaller then current key");
		}

		list.set(index, key);
		while (index > 0 && list.get(getParent(index)) < key) {
			int temp = list.get(getParent(index));
			list.set(getParent(index), list.get(index));
			list.set(index, temp);
			index = getParent(index);
		}
	}
	
	public void insert(int key){
		list.add(Integer.MIN_VALUE);
		heapSize++;
		increaseKey(heapSize-1, key);
	}

	private int getParent(int index) {
		int parent= (index / 2)-1;
		return (parent<0)?0:parent;
	}

	@Override
	public String toString() {
		return "PriortyQueue [list=" + list + ", heapSize=" + heapSize + "]";
	}

}
