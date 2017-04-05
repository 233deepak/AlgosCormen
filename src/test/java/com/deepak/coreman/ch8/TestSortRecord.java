package com.deepak.coreman.ch8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestSortRecord {

	private RecordSort recordSort;
	private List<Record> records;

	@Before
	public void init() {
		Record record1 = new Record(0, "1st");
		Record record2 = new Record(1, "6th");
		Record record3 = new Record(0, "2nd");
		Record record4 = new Record(0, "3rd");
		Record record5 = new Record(0, "4th");
		Record record6 = new Record(1, "7th");
		Record record7 = new Record(0, "5th");
		Record record8 = new Record(1, "8th");

		records = new ArrayList<Record>();
		records.add(record1);
		records.add(record2);
		records.add(record3);
		records.add(record4);
		records.add(record5);
		records.add(record6);
		records.add(record7);
		records.add(record8);

		recordSort = new RecordSort();

	}

	@Test
	public void testRecordSort() {
		ArrayHelper.printList(recordSort.sort(records, 2));
	}
	
	@Test
	public void testRecordSortInPlace() {
		ArrayHelper.printList(recordSort.sortInPlace(records));
	}

}
