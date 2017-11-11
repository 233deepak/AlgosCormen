package com.deepak.coreman.ch15.hackerrank;

import java.util.Scanner;

public class SolutionChange {
    
    private static long[] coins;
	private static long[][] memory;



	private static long exchange(long n, int index) {
		if (n < 0 || index < 0)
			return 0;
		if (n == 0)
			return 1;
        Long number = new Long(n);
        int numberIndex =  number.intValue();
		if (memory[numberIndex][index] != -1)
			return memory[numberIndex][index];
		long ways = exchange(n - coins[index], index) + exchange(n, index - 1);
		memory[numberIndex][index] = ways;
		return ways;
	}

    static long getWays(long n, long[] c){
        coins=c;
         Long number = new Long(n);
        int numberIndex =  number.intValue();
       		memory = new long[numberIndex + 1][c.length];
		for (int i = 0; i < n + 1; i++)
			for (int j = 0; j < c.length; j++)
				memory[i][j] = -1;
		return exchange(n, c.length - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long[] c = new long[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextLong();
        }
        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'
        long ways = getWays(n, c);
        System.out.println(ways);
    }
}
