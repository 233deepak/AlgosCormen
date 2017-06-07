package com.deepak.coreman.ch15;

public class Pair implements Comparable<Pair> {

	int a;
	int b;

	public Pair(int i, int j) {
		this.a = i;
		this.b = j;
	}

	public int compareTo(Pair o) {
		return (this.a > o.a) ? 1 : -1;
	}

	@Override
	public String toString() {
		return "Pair [a=" + a + ", b=" + b + "]";
	}

	
}
