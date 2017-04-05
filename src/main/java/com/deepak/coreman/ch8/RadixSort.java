package com.deepak.coreman.ch8;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {

	private RecordSort recordSort;

	public RadixSort() {
		recordSort = new RecordSort();

	}

	public List<Record> sortReocrds(List<Record> records, int bBits) {
		for (int i = bBits - 1; i >= 0; i--) {
			List<Record> tempRecords = getRecordsWithIthBit(records, i);
			records = recordSort.sort(tempRecords, 2);
		}
		return records;

	}

	private List<Record> getRecordsWithIthBit(List<Record> records, int i) {
		List<Record> tempRecords = new ArrayList<Record>();
		for (Record record : records) {
			int ithBit = record.bits[i];
			record.key = ithBit;
			tempRecords.add(record);
		}
		return tempRecords;
	}

}
