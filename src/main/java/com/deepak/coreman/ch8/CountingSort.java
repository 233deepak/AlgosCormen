package com.deepak.coreman.ch8;

public class CountingSort {

	public void sort(int[] a, int[] b, int k) {
		int[] c = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			c[i] = 0;
		}

		for (int j = 0; j < a.length; j++) {
			c[a[j]] = c[a[j]] + 1;
		}

		for (int i = 1; i <= k; i++) {
			c[i] += c[i - 1];
		}

		for (int i = a.length - 1; i >= 0; i--) {
			b[c[a[i]] - 1] = a[i];
			c[a[i]] = c[a[i]] - 1;
		}

	}

	public int count(int[] a, int k, int l, int u) {
		int[] b = new int[a.length];
		int[] c = new int[k + 1];
		for (int i = 0; i <= k; i++) {
			c[i] = 0;
		}

		for (int j = 0; j < a.length; j++) {
			c[a[j]] = c[a[j]] + 1;
		}

		int[] sum = new int[k+1];
		sum[0]=c[0];
		for (int i = 1; i <= k; i++) {
			sum[i] = c[i] + sum[i - 1];
		}
		

		int startPos = sum[l] - c[l];
		return sum[u] - startPos;
	}

}
