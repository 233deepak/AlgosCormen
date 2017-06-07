package com.deepak.coreman.ch15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BoxStacker {

	private List<Box> boxs;
	private int[] heightArray;
	private int[] stackarray;

	public int maximizeHeight() {
		rotateBoxes();
		sort();
		heightArray = new int[boxs.size()];
		stackarray = new int[boxs.size()];
		for (int i = 0; i < boxs.size(); i++) {
			heightArray[i] = boxs.get(i).height;
			stackarray[i] = i;
		}
		lis();
		return maxHeieght();
	}

	private int maxHeieght() {
		int max = heightArray[0];
		for (int i = 0; i < heightArray.length; i++) {
			if (heightArray[i] > max) {
				max = heightArray[i];
			}
		}
		return max;
	}

	private void lis() {
		for (int i = 0; i < boxs.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (hasLessArea(i, j) && hasMaxHeight(i, j)) {
					heightArray[i] = (heightArray[j] + boxs.get(i).height);
					stackarray[i] = j;
				}
			}
		}
	}

	private boolean hasMaxHeight(int i, int j) {
		return heightArray[i] < (heightArray[j] + boxs.get(i).height);
	}

	private boolean hasLessArea(int i, int j) {
		Box boxi = boxs.get(i);
		Box boxj = boxs.get(j);
		return (boxi.depth < boxj.depth && boxi.width < boxj.width);
	}

	private void sort() {
		Collections.sort(boxs, new Comparator<Box>() {

			public int compare(Box o1, Box o2) {
				return ((o1.width * o1.depth) < (o2.depth * o2.width)) ? 1 : -1;
			}
		});

	}

	private void rotateBoxes() {
		List<Box> newBoxs = new ArrayList<Box>();
		for (Box box : boxs) {
			Box box2 = new Box(box.width, box.height, box.depth);
			Box box3 = new Box(box.depth, box.height, box.width);
			newBoxs.add(box);
			newBoxs.add(box2);
			newBoxs.add(box3);
		}
		this.boxs = newBoxs;
	}

	public void setBoxes(List<Box> boxs) {
		this.boxs = boxs;
	}

}
