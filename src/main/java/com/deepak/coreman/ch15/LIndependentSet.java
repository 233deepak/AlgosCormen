package com.deepak.coreman.ch15;

import com.deepak.coreman.ch12.BNode;

public class LIndependentSet {

	public int maxLength(BNode root) {
		if (root == null)
			return 0;

		int include = 1;
		if (root.getLeft() != null)
			include += maxLength(root.getLeft().getLeft())
					+ maxLength(root.getLeft().getRight());
		if (root.getRight() != null)
			include += maxLength(root.getRight().getLeft())
					+ maxLength(root.getRight().getRight());

		int exclude = maxLength(root.getLeft()) + maxLength(root.getRight());
		return (include > exclude) ? include : exclude;
	}
}
