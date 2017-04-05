package com.deepak.coreman.ch4;

public class MatrixBound {

	int topRow;
	int bottomRow;
	int leftColumn;
	int rightColumn;

	public MatrixBound(int topRow, int bottomRow, int leftColumn,
			int rightColumn) {
		super();
		this.topRow = topRow;
		this.bottomRow = bottomRow;
		this.leftColumn = leftColumn;
		this.rightColumn = rightColumn;
	}

	@Override
	public String toString() {
		return "MatrixBound [topRow=" + topRow + ", bottomRow=" + bottomRow
				+ ", leftColumn=" + leftColumn + ", rightColumn=" + rightColumn
				+ "]";
	}

}
