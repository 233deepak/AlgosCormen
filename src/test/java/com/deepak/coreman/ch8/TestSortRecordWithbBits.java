package com.deepak.coreman.ch8;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.deepak.coreman.common.ArrayHelper;

public class TestSortRecordWithbBits {

	private RadixSort radixSort;
	private List<Record> records;

	@Before
	public void init() {
		radixSort = new RadixSort();
		Record record1 = new Record(new byte[]{0,1,1}, "3rd");
		Record record2 = new Record(new byte[]{0,0,1}, "1st");
		Record record3 = new Record(new byte[]{0,0,0}, "0th");
		Record record7 = new Record(new byte[]{1,1,1}, "7th");
		Record record4 = new Record(new byte[]{1,0,1}, "5th");
		Record record5 = new Record(new byte[]{1,0,0}, "4th");
		Record record6 = new Record(new byte[]{0,1,1}, "3rd");

		records = new ArrayList<Record>();
		records.add(record1);
		records.add(record2);
		records.add(record3);
		records.add(record7);
		records.add(record4);
		records.add(record5);
		records.add(record6);

	}
	
	@Test
	public void testSortNRecords(){
		ArrayHelper.printList(radixSort.sortReocrds(records, 3));
	}

}
