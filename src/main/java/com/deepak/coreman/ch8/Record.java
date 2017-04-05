package com.deepak.coreman.ch8;

public class Record {

	int key;
	byte[] bits;
	String data;

	public Record(int key, String data) {
		super();
		this.key = key;
		this.data = data;
	}
	
	public Record(byte[] bits, String data) {
		super();
		this.bits = bits;
		this.data = data;
	}



	@Override
	public String toString() {
		return "Record [key=" + key + ", data=" + data + "]";
	}

	public int getIthBit(int i, int base) {
		for (int j = 0; j < i; j++) {
			key = key / base;
		}
		return (key % base);
	}
}
