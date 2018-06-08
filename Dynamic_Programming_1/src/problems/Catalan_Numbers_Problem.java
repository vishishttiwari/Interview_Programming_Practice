package problems;
/*
Program for nth Catalan Number
Catalan numbers are a sequence of natural numbers that occurs in many interesting counting problems like following.

1) Count the number of expressions containing n pairs of parentheses which are correctly matched. For n = 3, possible expressions are ((())), ()(()), ()()(), (())(), (()()).

2) Count the number of possible Binary Search Trees with n keys (See this)

3) Count the number of full binary trees (A rooted binary tree is full if every vertex has either two children or no children) with n+1 leaves.

See this for more applications.



The first few Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …

Recursive Solution
Catalan numbers satisfy the following recursive formula.
C_0=1 \ and \ C_n_+_1=\sum_{i=0}^{n}C_iC_n_-_i \ for \ n\geq 0;
 */

public class Catalan_Numbers_Problem {
	static long catalanRecursion(int n) {
	    if (n == 0) return 1;
	    long result = 0;
	    for (int i = 0; i < n; i++) {
	        if (i == i-1-n) result += catalanRecursion(i);
	        else result += catalanRecursion(i) * catalanRecursion(n - 1 - i);
	    }
	    return result;
	}
	
	static long[] memo;
	static long catalanMemoization(int n) {
	    if (memo[n] != 0) return memo[n];
	    long result = 0;
	    for (int i = 0; i < n; i++) {
	        if (i == i-1-n) result += catalanMemoization(i);
	        else result += catalanMemoization(i) * catalanMemoization(n - 1 - i);
	    }
	    memo[n] = result;
	    return memo[n];
	}
	
	static long catalanDP(int n) {
	    long[] memoDP = new long[n+1];
	    memoDP[0] = 1;
	    for (int i = 1; i <= n; i++) {
	        for (int j = 0; j < i; j++) {
	            memoDP[i] += memoDP[j]*memoDP[i-1-j];
	        }
	    }
	    return memoDP[n];
	}
}
