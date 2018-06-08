package problems;
/*
 * Dynamic Programming | Set 30 (Dice Throw)
Given n dice each with m faces, numbered from 1 to m, find the number of ways to get sum X. X is the summation of values on each face when all the dice are thrown.
 */
public class Dice_Throw_Problem {
	
	static long[][] memo;
	static void initialization(int side, int n, int X) {
		memo = new long[n + 1][X + 1];
		memo[0][0] = 1;
		System.out.println(diceDP(side, n, X));
	}
	
	static long diceDP(int side, int n, int X) {
		if (X < 0 || n < 0) return 0;
		if (memo[n][X] != 0) return memo[n][X];
		long current = 0;
		for (int i = 0; i < side; i++) {
			current = diceDP(side, n - 1, X - (i + 1));
			if (current != 0) memo[n][X] += current; 
		}
		return memo[n][X];
	}
}
