package com.deepak.coreman.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FIFOQueue<T> {

	private int priorityCount;
	private int priorityQueueSize;
	private List<Integer> list;
	private Map<Integer, T> keyMap;

	public FIFOQueue() {
		list = new ArrayList<Integer>();
		priorityCount = 0;
		priorityQueueSize = 0;
		keyMap = new HashMap<Integer, T>();
	}

	public void enqueue(T t) {
		int key = ++priorityCount;
		keyMap.put(key, t);
		list.add(Integer.MIN_VALUE);
		increseKey(key);
	}

	private void increseKey(int value) {
		list.set(priorityQueueSize, value);
		int index = priorityQueueSize;
		int parent = 0;
		while (index > 0 && list.get((parent = getParent(index))) > value) {
			int temp = list.get(parent);
			list.set(parent, value);
			list.set(index, temp);
			index = parent;
		}
		priorityQueueSize++;
	}

	public T dequeue() {
		T element = keyMap.get(list.get(0));
		int temp = list.get(0);
		list.set(0, list.get(priorityQueueSize-1));
		list.set(priorityQueueSize-1, temp);
		minHeapify(0);
		return null;

	}

	private void minHeapify(int index) {
       	if(index>((list.size()/2)-1))
       		return;
       	int left = (2*index)+1;
       	int right = (2*index)+2;
       	if(right>=priorityQueueSize){
       		
       	}
	}

	private int getParent(int i) {
		int parent = ((i / 2) - 1);
		return (parent < 0) ? 0 : parent;
	}

	@Override
	public String toString() {
		return "FIFOQueue [priorityCount=" + priorityCount
				+ ", priorityQueueSize=" + priorityQueueSize + ", list=" + list
				+ ", keyMap=" + keyMap + "]";
	}

}
