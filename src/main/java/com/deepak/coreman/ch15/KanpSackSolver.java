package com.deepak.coreman.ch15;

import java.util.Scanner;

public class KanpSackSolver {

	private int[] weights;
	private int[] profits;
	private int knapscakCapacity;
	private int[][] memory;

	public int maxiMizeProfit(int weight, int itemIndex) {

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

	private int max(int i, int j) {
		return (i > j) ? i : j;
	}

	public int maxiMizeProfit() {
		memory = new int[knapscakCapacity + 1][profits.length];
		for (int i = 0; i < knapscakCapacity + 1; i++)
			for (int j = 0; j < profits.length; j++)
				memory[i][j] = -1;
		return maxiMizeProfit(knapscakCapacity, profits.length - 1);
	}
	
	
	private void knapSack() {
		// Input the number of test cases you want to run
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			// Input the size of the array
			int n = sc.nextInt();
			int w = sc.nextInt();
			

			int[] profit = new int[n];
			int[] weight = new int[n];
			
			int index=0;
			for(;index<n;index++)
				profit[index]= sc.nextInt();
			index=0;
			for(;index<n;index++)
				weight[index]= sc.nextInt();
			this.setKnapscakCapacity(w);
			this.setProfits(profit);
			this.setWeights(weight);
			// Input the element to be searched

			// Compute and print result
			System.out.println(maxiMizeProfit());

			t--;
		}

	}
	
	public static void main(String[] args) {
		new KanpSackSolver().knapSack();
	}

	public int[] getWeights() {
		return weights;
	}

	public void setWeights(int[] weights) {
		this.weights = weights;
	}

	public int[] getProfits() {
		return profits;
	}

	public void setProfits(int[] profits) {
		this.profits = profits;
	}

	public int getKnapscakCapacity() {
		return knapscakCapacity;
	}

	public void setKnapscakCapacity(int knapscakCapacity) {
		this.knapscakCapacity = knapscakCapacity;
	}

}
