package com.deepak.coreman.ch8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RecordSort {

	public List<Record> sort(List<Record> records, int possibleBitValues) {
		int[] c = new int[possibleBitValues];
		for (Record record : records) {
			c[record.key] += 1;

		}

		for (int i = 1; i < c.length; i++) {
			c[i] = c[i] + c[i - 1];
		}

		List<Record> sortedList = new ArrayList<Record>(records.size());
		for (int i = 0; i < records.size(); i++) {
			sortedList.add(null);

		}
		ListIterator<Record> listIterator = records
				.listIterator(records.size());

		while (listIterator.hasPrevious()) {
			Record record = listIterator.previous();
			sortedList.set(c[record.key] - 1, record);
			c[record.key] -= 1;

		}
		return sortedList;

	}

	public List<Record> sortInPlace(List<Record> records) {
		partition(records, 0, records.size() - 1);
		return records;

	}

	private void partition(List<Record> records, int p, int r) {
		int i = p - 1;
		Record pivot = records.get(r);
		for (int k = p; k <= r - 1; k++) {
			if (records.get(k).key < pivot.key) {
				i++;
				Record temp = records.get(k);
				records.set(k, records.get(i));
				records.set(i, temp);
			}
		}

	}
}
