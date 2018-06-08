package problems;
public class Binomial_Coefficient_Problem {
	static long binomialCoeffRecursion(int n, int k) {
	    if (k == 0) return 1;
	    if (k == n) return 1;
	    
	    return binomialCoeffRecursion(n-1, k-1) + binomialCoeffRecursion(n-1, k);
	}
	
	static long[][] memo;
	static long binomialCoeffMemoization(int n, int k) {
	    if (memo[n][k] != 0) return memo[n][k];
	    
	    if (k == 0) memo[n][k] = 1;
	    else if (k == n) memo[n][k] = 1;
	    else {
	        memo[n][k] = binomialCoeffMemoization(n-1, k-1) + binomialCoeffMemoization(n-1, k);
	    }
	    
	    return memo[n][k];
	}
}
