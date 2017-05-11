package com.deepak.coreman.common;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		knapSack();
	}
	
	

	private static  int[] weights;
	private static int[] profits;
	private static int knapscakCapacity;
	private static int[][] memory;

	public static int maxiMizeProfit(int weight, int itemIndex) {

		if (weight <= 0 || itemIndex < 0) {
			return 0;
		}

		if (memory[weight][itemIndex] != -1)
			return memory[weight][itemIndex];
		int profit;
		if (weight - weights[itemIndex] < 0) {
			profit = maxiMizeProfit(weight, itemIndex - 1);
		} else
			profit = max(
					profits[itemIndex]
							+ maxiMizeProfit(weight - weights[itemIndex],
									itemIndex - 1),
					maxiMizeProfit(weight, itemIndex - 1));
		memory[weight][itemIndex] = profit;
		return profit;

	}

	private static int max(int i, int j) {
		return (i > j) ? i : j;
	}

	public static int maxiMizeProfit() {
		memory = new int[knapscakCapacity + 1][profits.length];
		for (int i = 0; i < knapscakCapacity + 1; i++)
			for (int j = 0; j < profits.length; j++)
				memory[i][j] = -1;
		return maxiMizeProfit(knapscakCapacity, profits.length - 1);
	}
	
	
	private static void knapSack() {
		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int w = sc.nextInt();
			

			profits = new int[n];
			weights = new int[n];
			knapscakCapacity =w;
			int index=0;
			for(;index<n;index++)
				profits[index]= sc.nextInt();
			index=0;
			for(;index<n;index++)
				weights[index]= sc.nextInt();
			
			// Input the element to be searched

			// Compute and print result
			System.out.println(maxiMizeProfit());

			t--;
		}

	}


}